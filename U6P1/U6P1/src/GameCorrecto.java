public class GameCorrecto {
    PlayerCorrecto p;

    public void movement (String m) {
        switch (m) {
            case "Derecha" -> p.setX(p.getX() + 1);
            case "Izquierda" -> p.setX(p.getX() - 1);
            case "Arriba" -> p.setY(p.getY() - 1);
            case "Abajo" -> p.setY(p.getY() + 1);
        }
    }
}
