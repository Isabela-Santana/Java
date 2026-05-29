package cinema;

abstract class Relogio {
    protected int hora, minuto, segundo;

    public void setHora(int hora) { if (hora >= 0 && hora < 24) this.hora = hora; }
    public void setMinuto(int minuto) { if (minuto >= 0 && minuto < 60) this.minuto = minuto; }
    public void setSegundo(int segundo) { if (segundo >= 0 && segundo < 60) this.segundo = segundo; }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método abstrato solicitado
    public abstract void sincronizar(Relogio outroRelogio);
}

class RelogioBrasileiro extends Relogio {
    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.hora = outroRelogio.hora;
        this.minuto = outroRelogio.minuto;
        this.segundo = outroRelogio.segundo;
    }
}

class RelogioAmericano extends Relogio {
    @Override
    public String getHoraFormatada() {
        int h = (hora == 0 || hora == 12) ? 12 : hora % 12;
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, minuto, segundo, periodo);
    }

    @Override
    public void sincronizar(Relogio outroRelogio) {
        this.hora = outroRelogio.hora;
        this.minuto = outroRelogio.minuto;
        this.segundo = outroRelogio.segundo;
    }
}
