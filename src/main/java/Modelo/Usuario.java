package Modelo;
/*
Esta clase sera para tal cual construir al usuario,
los datos que tendra el chavalete, los cuales seran




    `id_usu` INT NOT NULL COMMENT 'identificador del usuario\n',

  `fcre_usu` DATE NULL COMMENT 'fecha creacion de usuario',

  `nom_usu` VARCHAR(45) NULL COMMENT 'nombre del usuario',

  `app_usu` VARCHAR(45) NULL COMMENT 'apellido paterno',

  `apm_usu` VARCHAR(45) NULL COMMENT 'apellido materno',

  `id_rol` INT NULL COMMENT 'id del rol que figura, si es el que creo el grupo sera lider, si el familia',

  `id_gfa` INT NULL COMMENT 'id del grupo familiar al que se unio',

  `id_dat` INT NULL COMMENT 'id de los datos de accedo del usuairio, correo y pass',
 */

import java.sql.Date;

public class Usuario extends BDObject{

    /*
    Para qu esto sea seguro deberemos poner los atributos privador
    Para que solo puedan ser accedidos por metodos de esta clase
     */

 //   private int id_usu;
//Identificador del usuario : id_usu / En la BD se llama : id_usu

    private Date fec_cre;
//Fecha creacion del usuario : fec_cre / En la BD se llama : fcre_usu

    //EL nombre separado : son Strings, solo que los declaro en una linea

    private String nom_usu, ap_pat, ap_mat ;
    //En la bd son nom_usu, app_usu, apm_usu respectivamente

    private int rol;
    //Identificador del rol que figura/ en La BD se llama : id_rol

    private int grup_fam;
    //Identificador del grupo familiar al que pertenece, en la bd se llama : id_gfa

    private int dat_acc;
    //Identificador de sus datos de acceso, en la bd se llama : id_dat

    private Boolean permiso; //si o no
    //Identificador de los permisos que tiene , en la bd se llama : id_perm


    //creamos su inicializador

    public Usuario() {
        //asi vacio
    }


    //creamos una sobrescritura de metodo con super con el parametro super(id) que es heredado de BDObject


    public Usuario(int id, Date fec_cre, String nom_usu, String ap_pat, String ap_mat, int rol, int grup_fam, int dat_acc, boolean permiso) {
        super(id);
        this.dat_acc = dat_acc;
        this.nom_usu = nom_usu;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
        this.rol = rol;
        this.grup_fam = grup_fam;
        this.dat_acc = dat_acc;
        this.permiso = permiso;
    }

    // repetios el proceso pero sin que el parametro super tenga el campo id
    public Usuario( Date fec_cre, String nom_usu, String ap_pat, String ap_mat, int rol, int grup_fam, int dat_acc, boolean permiso) {
        super();
        this.dat_acc = dat_acc;
        this.nom_usu = nom_usu;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
        this.rol = rol;
        this.grup_fam = grup_fam;
        this.dat_acc = dat_acc;
        this.permiso = permiso;
    }

    //ahora generamos los getters & setters


    public Date getFec_cre() {
        return fec_cre;
    }

    public void setFec_cre(Date fec_cre) {
        this.fec_cre = fec_cre;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getGrup_fam() {
        return grup_fam;
    }

    public void setGrup_fam(int grup_fam) {
        this.grup_fam = grup_fam;
    }

    public int getDat_acc() {
        return dat_acc;
    }

    public void setDat_acc(int dat_acc) {
        this.dat_acc = dat_acc;
    }

    public Boolean getPermiso() {
        return permiso;
    }

    public void setPermiso(Boolean permiso) {
        this.permiso = permiso;
    }


}