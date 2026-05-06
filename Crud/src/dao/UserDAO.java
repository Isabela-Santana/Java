package dao;

import dao.exception.UserNotFoundException;
import dao.model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private long nextId = 1L;
    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        UserModel toUpdate = findById(model.getId());
        int index = models.indexOf(toUpdate);
        models.set(index, model);
        return model;
    }

    public void delete(final long id) {
        UserModel toDelete = findById(id);
        models.remove(toDelete);
    }

    public UserModel findById(final long id) {
        // CORREÇÃO AQUI: Passando o 'id' como segundo argumento do String.format
        return models.stream()
            .filter(u -> u.getId() == id)
            .findFirst()
            .orElseThrow(() -> new UserNotFoundException(String.format("Não existe usuário com o id %s cadastrado", id)));
    }

    public List<UserModel> findAll() {
        return new ArrayList<>(models);
    }
}