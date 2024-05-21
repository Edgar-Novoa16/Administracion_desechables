package Modelo;

public class Proveedor {

    private int idProveedor;
    private String nombreProveedor;
    private String numeroContacto;
    private String municipio;
    private String estadoProveedor;
    private String calleProveedor;
    private String numero;
    private String coloniaProveedor;
    private String codigoPostalProveedor;
    private int cantidadInicial;
    private int cantidadFinal;
    private String situacionProveedor;
    private String tipoProductoProveedor;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(String estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public String getCalleProveedor() {
        return calleProveedor;
    }

    public void setCalleProveedor(String calleProveedor) {
        this.calleProveedor = calleProveedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColoniaProveedor() {
        return coloniaProveedor;
    }

    public void setColoniaProveedor(String coloniaProveedor) {
        this.coloniaProveedor = coloniaProveedor;
    }

    public String getCodigoPostalProveedor() {
        return codigoPostalProveedor;
    }

    public void setCodigoPostalProveedor(String codigoPostalProveedor) {
        this.codigoPostalProveedor = codigoPostalProveedor;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public int getCantidadFinal() {
        return cantidadFinal;
    }

    public void setCantidadFinal(int cantidadFinal) {
        this.cantidadFinal = cantidadFinal;
    }

    public String getSituacionProveedor() {
        return situacionProveedor;
    }

    public void setSituacionProveedor(String situacionProveedor) {
        this.situacionProveedor = situacionProveedor;
    }

    public String getTipoProductoProveedor() {
        return tipoProductoProveedor;
    }

    public void setTipoProductoProveedor(String tipoProductoProveedor) {
        this.tipoProductoProveedor = tipoProductoProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor\n" + "IdProveedor = " + idProveedor + "\nNombre Proveedor = " + nombreProveedor + "\nNumero de Contacto = " + numeroContacto + 
                "\nMunicipio = " + municipio + "\nEstado Proveedor = " + estadoProveedor + "Calle Proveedor = " + calleProveedor + "Numero = " + numero +
                "Colonia Proveedor = " + coloniaProveedor + "Código Postal Proveedor = " + codigoPostalProveedor + "Situación del proveedor = " + situacionProveedor;
    }
    
    
    
}
