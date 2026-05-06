import dao.UserDAO;
import dao.model.MenuOption;
import dao.model.UserModel;
import dao.exception.UserNotFoundException;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n--- MENU DE CADASTRO ---");
                System.out.println("1 - Cadastrar | 2 - Atualizar | 3 - Excluir | 4 - Buscar | 5 - Listar | 6 - Sair");
                
                String input = scanner.nextLine();
                int userInput = Integer.parseInt(input);

                if (userInput < 1 || userInput > MenuOption.values().length) {
                    System.err.println("Opção inválida!");
                    continue;
                }

                var selectedOption = MenuOption.values()[userInput - 1];

                switch (selectedOption) {
                    case SAVE -> System.out.println("Cadastrado: " + dao.save(requestToSave()));
                    case UPDATE -> System.out.println("Atualizado: " + dao.update(requestToUpdate()));
                    case DELETE -> {
                        dao.delete(requestId());
                        System.out.println("Usuário deletado com sucesso.");
                    }
                    case FIND_BY_ID -> System.out.println("Usuário encontrado: " + dao.findById(requestId()));
                    case FIND_ALL -> dao.findAll().forEach(System.out::println);
                    case EXIT -> System.exit(0);
                }
            } catch (UserNotFoundException e) {
                System.err.println("Aviso: " + e.getMessage());
            } catch (DateTimeParseException e) {
                System.err.println("Erro: Formato de data inválido! Use dd/MM/yyyy.");
            } catch (NumberFormatException e) {
                System.err.println("Erro: Digite apenas números para IDs e opções.");
            } catch (Exception e) {
                System.err.println("Erro inesperado: " + e.getMessage());
                e.printStackTrace(); // Isso ajuda a debugar se algo novo aparecer
            }
        }
    }

    private static UserModel requestToSave() {
        System.out.println("Nome:");
        String nome = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        return new UserModel(0, nome, email, readDate());
    }

    private static UserModel requestToUpdate() {
        long id = requestId();
        System.out.println("Novo Nome:");
        String nome = scanner.nextLine();
        System.out.println("Novo Email:");
        String email = scanner.nextLine();
        return new UserModel(id, nome, email, readDate());
    }

    private static long requestId() {
        System.out.println("Informe o ID do usuário:");
        return Long.parseLong(scanner.nextLine());
    }

    private static OffsetDateTime readDate() {
        System.out.println("Data de nascimento (dd/MM/yyyy):");
        String dateStr = scanner.nextLine();
        return LocalDate.parse(dateStr, formatter).atStartOfDay(ZoneOffset.UTC).toOffsetDateTime();
    }
}