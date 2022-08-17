package cl.darkos.Grupal06_1M6.model.entity;



public class Contacto {

    private String email;
    private String mensaje;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "email='" + email + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
