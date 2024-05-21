package Modelo;


public class Usuario {
    
    
    
    
    
    //ATRIBUTOS
    private int idUsuario = 0;
    private String estado_del_usuario;
    private String nombre_de_usuario;
    private String contraseña_de_usuario;
    private String privilegio_de_usuario;
    private int filtroCantidadUsuarios;
    
    public int getIdUsuario() {
        return idUsuario;
    }

    //MÉTODOS
    public void setIdUsuario(int idUsuario) {    
        this.idUsuario = idUsuario;
    }

    public String getEstado_del_usuario() {
        return estado_del_usuario;
    }

    public void setEstado_del_usuario(String estado_del_usuario) {
        this.estado_del_usuario = estado_del_usuario;
    }

    public String getNombre_de_usuario() {
        return nombre_de_usuario;
    }

    public void setNombre_de_usuario(String nombre_de_usuario) {
        this.nombre_de_usuario = nombre_de_usuario;
    }

    public String getContraseña_de_usuario() {
        return contraseña_de_usuario;
    }

    public void setContraseña_de_usuario(String contraseña_de_usuario) {
        this.contraseña_de_usuario = contraseña_de_usuario;
    }

    public String getPrivilegio_de_usuario() {
        return privilegio_de_usuario;
    }

    public void setPrivilegio_de_usuario(String privilegio_de_usuario) {
        this.privilegio_de_usuario = privilegio_de_usuario;
    }

    public int getFiltroCantidadUsuarios() {
        return filtroCantidadUsuarios;
    }

    public void setFiltroCantidadUsuarios(int filtroCantidadUsuarios) {
        this.filtroCantidadUsuarios = filtroCantidadUsuarios;
    }

    
    
    @Override
    public String toString() {
        return "Usuario\n\n" + "estado_del_usuario = " + estado_del_usuario + "\n\n nombre_de_usuario = " + nombre_de_usuario + "\n\n contraseña_de_usuario = " + contraseña_de_usuario + "\n\n privilegio_de_usuario = " + privilegio_de_usuario;
    }
    
    
    
    
}
