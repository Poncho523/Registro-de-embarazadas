package Interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataBase {

    Connection con;
    Statement st, st2;
    ResultSet rs, rs2;
    int id;

    public DataBase () {
        conectar();
    }

    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://b7pirc16pxhklfyrgbny-mysql.services.clever-cloud.com:3306/b7pirc16pxhklfyrgbny","uo4scw6rhfd3tjfh","kEVWFGYJjskFkzJyCKP1");
            st = con.createStatement();
            st2 = con.createStatement();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void desconectar(){
        try {
            if (rs != null) rs.close();
            if (rs2 != null) rs2.close();
            if (st != null) st.close();
            if (st2 != null) st2.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void newDoctor (String nombreRegistrado, String segundoNombreRegistrado, String apellidoPaternoRegistrado, String apellidoMaternoRegistrado, String sexoRegistrado){
        try {
            boolean sexo;
            if (sexoRegistrado.equals("1")){
                sexo = true;
            } else {
                sexo = false;
            }
            String nombre = nombreRegistrado + " " + segundoNombreRegistrado;
            String insert = "insert into MEDICOS (Nombres, Apellido_Paterno, Apellido_Materno, Sexo) values (?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1, nombre);
            ps.setString(2, apellidoPaternoRegistrado);
            ps.setString(3, apellidoMaternoRegistrado);
            ps.setBoolean(4, sexo);
            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] doctores () {
        ArrayList<String> doctores = new ArrayList<>();
        String[] doctors = new String[0];
        try {
            rs = st.executeQuery("select * from MEDICOS");
            while (rs.next()){
                doctores.add(rs.getString("Nombres"));
            }
            doctors = new String[doctores.size()];
            for (int i=0; i<doctores.size(); i++){
                doctors[i] = doctores.get(i);
            }
            return doctors;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctors;
    }
    
    public String idMedicoTratante (String nombreMedico){
        int idMedico = 0;
        String medicoTratante = "";
        try {
            String query = "select ID from MEDICOS where Nombres = '"+nombreMedico+"'";
            rs2 = st2.executeQuery(query);
            rs2.next();
            medicoTratante = String.valueOf(rs2.getInt("ID"));
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return medicoTratante;
    }
    

    public DefaultTableModel columnas (){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
            modelo.addColumn("Jurisdicción Sanitaria");
            modelo.addColumn("Coordinación Municipal");
            modelo.addColumn("Unidad Médica");
            modelo.addColumn("Clave CLUES");
            modelo.addColumn("Medico Tratante");
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Calle");
            modelo.addColumn("# Exterior");
            modelo.addColumn("# Interior");
            modelo.addColumn("Colonia");
            modelo.addColumn("Localidad");
            modelo.addColumn("Municipio");
            modelo.addColumn("CURP");
            modelo.addColumn("Edad");
            modelo.addColumn("Telefono");
            modelo.addColumn("Telefono Familiar");
            modelo.addColumn("Lengua Indigena");
            modelo.addColumn("Grado Escolar");
            modelo.addColumn("Seguro Social");
            modelo.addColumn("Numero Expediente");
            modelo.addColumn("FUR");
            modelo.addColumn("FPP");
            modelo.addColumn("# Partos");
            modelo.addColumn("# Cesáreas");
            modelo.addColumn("# Abortos");
            modelo.addColumn("# Gestas");
            modelo.addColumn("Resolución Ultimo Evento Obstetrico");
            modelo.addColumn("Diagnóstico Actualizado");
            modelo.addColumn("# Consultas");
            modelo.addColumn("Tensión Arterial");
            modelo.addColumn("Riesgo Obstétrico");
            modelo.addColumn("Ácido Fólico");
            modelo.addColumn("Sulfato Ferroso");
            modelo.addColumn("Vacuna TTD");
            modelo.addColumn("Vacuna TDPA");
            modelo.addColumn("Vacuna Influenza");
            modelo.addColumn("Plan De Seguridad");
            modelo.addColumn("Método de Planificación Familiar");
            modelo.addColumn("Fecha Evento Obstétrico");
            modelo.addColumn("Mujer en Puerperio");
        return modelo;
    }

    public DefaultTableModel censo (){
        DefaultTableModel modelo = columnas();
        try {
            rs = st.executeQuery("select * from PACIENTES where Mujer_Puerperio=0");
            while (rs.next()){
                int id = rs.getInt("ID");
                String jurisdiccion = jurisdiccionSanitaria(rs.getInt("Jurisdiccion_Sanitaria"));
                String coordinacion = rs.getString("Coordinacion_Municipal");
                String unidad = rs.getString("Unidad_Medica");
                String clues = rs.getString("Clave_CLUES");
                String medico = medicoTratante(rs.getInt("Medico_Tratante"));
                String ap = rs.getString("Apellido_Paterno");
                String am = rs.getString("Apellido_Materno");
                String name = rs.getString("Nombre");
                String calle = rs.getString("Calle");
                int nExt = rs.getInt("Numero_Exterior");
                int nInt = rs.getInt("Numero_Interior");
                String colonia = rs.getString("Colonia");
                String localidad = rs.getString("Localidad");
                String municipio = rs.getString("Municipio");
                String curp = rs.getString("CURP");
                int edad = rs.getInt("Edad");
                String telefono = rs.getString("Telefono");
                String telefonoFamiliar = rs.getString("Telefono_Familiar");
                String lenguaIndigena = rs.getString("Lengua_Indigena");
                String gradoEscolar = gradoEscolar(rs.getInt("Grado_Escolar"));
                String seguroSocial = rs.getString("Seguro_social");
                String numeroExpediente = rs.getString("Numero_Expediente");
                Date FUR = rs.getDate("FUR");
                Date FPP = rs.getDate("FPP");
                int numeroPartos = rs.getInt("Numero_Partos");
                int numeroCesareas = rs.getInt("Numero_Cesareas");
                int numeroAbortos = rs.getInt("Numero_Abortos");
                int numeroGestas = rs.getInt("Numero_Gestas");
                String resolucionUltimoEvento = resolucionUltimoEvento(rs.getInt("Tipo_Resolucion_Ultimo_Evento"));
                String diagnostico = rs.getString("Diagnostico_Actualizado");
                int numeroConsultas = rs.getInt("Numero_Consultas");
                String tensionArterial = rs.getString("Tension_Arterial");
                String riesgo = riesgoObstetrico(rs.getBoolean("Riesgo_Obstetrico"));
                String acidoFolico = sino(rs.getBoolean("Acido_Folico"));
                String sulfatoFerroso = sino(rs.getBoolean("Sulfato_Ferroso"));
                String vacunaTTD = sino(rs.getBoolean("VAC_TTD"));
                String vacunaTDPA = sino(rs.getBoolean("VAC_TDPA"));
                String vacunaInfluenza = sino(rs.getBoolean("VAC_INFLUENZA"));
                String planSeguridad = sino(rs.getBoolean("Plan_Seguridad"));
                String planificacionFamiliar = planificacionFamiliar(rs.getInt("Planificacion_Familiar"));
                Date fechaEventoObstetrico = rs.getDate("Fecha_Evento_Obstetrico");
                String mujerPuerperio = sino(rs.getBoolean("Mujer_Puerperio"));
                modelo.addRow(new Object[]{id,jurisdiccion,coordinacion,unidad,clues,medico,ap,am,name,calle,nExt,nInt,colonia,localidad,municipio,curp,edad,telefono,telefonoFamiliar,lenguaIndigena,gradoEscolar,seguroSocial,numeroExpediente,FUR,FPP,numeroPartos,numeroCesareas,numeroAbortos,numeroGestas,resolucionUltimoEvento,diagnostico,numeroConsultas,tensionArterial,riesgo,acidoFolico,sulfatoFerroso,vacunaTTD,vacunaTDPA,vacunaInfluenza,planSeguridad,planificacionFamiliar,fechaEventoObstetrico,mujerPuerperio});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    public DefaultTableModel puerperas (){
        DefaultTableModel modelo = columnas();
        try {
            rs = st.executeQuery("select * from PACIENTES where Mujer_Puerperio=1");
            while (rs.next()){
                int id = rs.getInt("ID");
                String jurisdiccion = jurisdiccionSanitaria(rs.getInt("Jurisdiccion_Sanitaria"));
                String coordinacion = rs.getString("Coordinacion_Municipal");
                String unidad = rs.getString("Unidad_Medica");
                String clues = rs.getString("Clave_CLUES");
                String medico = medicoTratante(rs.getInt("Medico_Tratante"));
                String ap = rs.getString("Apellido_Paterno");
                String am = rs.getString("Apellido_Materno");
                String name = rs.getString("Nombre");
                String calle = rs.getString("Calle");
                int nExt = rs.getInt("Numero_Exterior");
                int nInt = rs.getInt("Numero_Interior");
                String colonia = rs.getString("Colonia");
                String localidad = rs.getString("Localidad");
                String municipio = rs.getString("Municipio");
                String curp = rs.getString("CURP");
                int edad = rs.getInt("Edad");
                String telefono = rs.getString("Telefono");
                String telefonoFamiliar = rs.getString("Telefono_Familiar");
                String lenguaIndigena = rs.getString("Lengua_Indigena");
                String gradoEscolar = gradoEscolar(rs.getInt("Grado_Escolar"));
                String seguroSocial = rs.getString("Seguro_social");
                String numeroExpediente = rs.getString("Numero_Expediente");
                Date FUR = rs.getDate("FUR");
                Date FPP = rs.getDate("FPP");
                int numeroPartos = rs.getInt("Numero_Partos");
                int numeroCesareas = rs.getInt("Numero_Cesareas");
                int numeroAbortos = rs.getInt("Numero_Abortos");
                int numeroGestas = rs.getInt("Numero_Gestas");
                String resolucionUltimoEvento = resolucionUltimoEvento(rs.getInt("Tipo_Resolucion_Ultimo_Evento"));
                String diagnostico = rs.getString("Diagnostico_Actualizado");
                int numeroConsultas = rs.getInt("Numero_Consultas");
                String tensionArterial = rs.getString("Tension_Arterial");
                String riesgo = riesgoObstetrico(rs.getBoolean("Riesgo_Obstetrico"));
                String acidoFolico = sino(rs.getBoolean("Acido_Folico"));
                String sulfatoFerroso = sino(rs.getBoolean("Sulfato_Ferroso"));
                String vacunaTTD = sino(rs.getBoolean("VAC_TTD"));
                String vacunaTDPA = sino(rs.getBoolean("VAC_TDPA"));
                String vacunaInfluenza = sino(rs.getBoolean("VAC_INFLUENZA"));
                String planSeguridad = sino(rs.getBoolean("Plan_Seguridad"));
                String planificacionFamiliar = planificacionFamiliar(rs.getInt("Planificacion_Familiar"));
                Date fechaEventoObstetrico = rs.getDate("Fecha_Evento_Obstetrico");
                String mujerPuerperio = sino(rs.getBoolean("Mujer_Puerperio"));
                modelo.addRow(new Object[]{id,jurisdiccion,coordinacion,unidad,clues,medico,ap,am,name,calle,nExt,nInt,colonia,localidad,municipio,curp,edad,telefono,telefonoFamiliar,lenguaIndigena,gradoEscolar,seguroSocial,numeroExpediente,FUR,FPP,numeroPartos,numeroCesareas,numeroAbortos,numeroGestas,resolucionUltimoEvento,diagnostico,numeroConsultas,tensionArterial,riesgo,acidoFolico,sulfatoFerroso,vacunaTTD,vacunaTDPA,vacunaInfluenza,planSeguridad,planificacionFamiliar,fechaEventoObstetrico,mujerPuerperio});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    public String jurisdiccionSanitaria (int id){
        String jurisdiccion = "";
        try {
            String query = "select Jurisdiccion from JURISDICCIONES_SANITARIAS where id="+String.valueOf(id);
            rs2 = st2.executeQuery(query);
            rs2.next();
            jurisdiccion = rs2.getString("Jurisdiccion");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jurisdiccion;
    }

    public String medicoTratante (int id){
        String medico = "";
        try {
            String query = "select Nombres, Apellido_Paterno, Apellido_Materno from MEDICOS where id="+String.valueOf(id);
            rs2 = st2.executeQuery(query);
            rs2.next();
            medico = rs2.getString("Nombres")+" "+rs2.getString("Apellido_Paterno")+" "+rs2.getString("Apellido_Materno");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medico;
    }

    

    public String lenguaIndigena(int i){
        String lengua = "";
        switch (i){
            case 0:
                lengua = "Indígena";
                break;
            case 1:
                lengua = "Español";
                break;
            case 2:
                lengua = "Ambas";
                break;
        }
        return lengua;
    }

    public String gradoEscolar (int id){
        String gradoEscolar = "";
        try {
            String query = "select Grado_Escolar from GRADO_ESCOLAR where id="+String.valueOf(id);
            rs2 = st2.executeQuery(query);
            rs2.next();
            gradoEscolar = rs2.getString("Grado_Escolar");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gradoEscolar;
    }

    public String resolucionUltimoEvento (int id){
        String resolucionUltimoEvento = "";
        try {
            String query = "select Ultimo_Evento from ULTIMO_EVENTO where id="+String.valueOf(id);
            rs2 = st2.executeQuery(query);
            rs2.next();
            resolucionUltimoEvento = rs2.getString("Ultimo_Evento");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resolucionUltimoEvento;
    }

    public String planificacionFamiliar (int id){
        String planificacionFamiliar = "";
        try {
            String query = "select Planificacion_Familiar from PLANIFICACION_FAMILIAR where id="+String.valueOf(id);
            rs2 = st2.executeQuery(query);
            rs2.next();
            planificacionFamiliar = rs2.getString("Planificacion_Familiar");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return planificacionFamiliar;
    } 

    public String riesgoObstetrico (boolean riesgo){
        if (riesgo){
            return "Alto";
        } else {
            return "Bajo";
        }
    }

    public String sino (boolean booleana){
        if (booleana){
            return "Sí";
        } else {
            return "No";
        }
    }

    public String separarNombre (String name, int i){
        String retorno = "";
        switch (i){
            case 0:
                retorno = name.split(" ")[2];
                break;
            case 1:
                retorno = name.split(" ")[0];
                break;
            case 2:
                retorno = name.split(" ")[1];
                break;
        }
        return retorno;
    }

    public void registrarConsulta (String[] datos, int[] index, boolean[] unoCero){
        try {
            int jurisdiccionSanitaria = index[1]+1;
            String coordinacionMunicipal = datos[4];
            String unidadMedica = datos[5];
            String claveClues = datos[6];
            String medicoTratante = idMedicoTratante(datos[3]);
            String aPaterno = separarNombre(datos[0], 1);
            String aMaterno = separarNombre(datos[0], 2);
            String nombres = separarNombre(datos[0], 0);
            String calle = datos[7];
            int noExt = Integer.parseInt(datos[8]);
            int noInt = Integer.parseInt(datos[9]);
            String colonia = datos[10];
            String localidad = datos[11];
            String municipio = datos[12];
            String CURP = datos[2];
            int edad = index[0];
            String telefono = datos[1];
            String telefonoFamiliar = datos[13];
            String lenguaIndigena = lenguaIndigena(index[2]);
            int gradoEscolar = index[3]+1;
            String seguroSocial = datos[15];
            String numeroExpediente = datos[14];
            String FUR = datos[16];
            String FPP = datos[17];
            int noPartos = index[4];
            int noCesareas = index[5];
            int noAbortos = index[6];
            int noGestas = index[7];
            int tipoResolucion = index[8]+1;
            String diagnosticoActualizado = datos[18];
            int noConsultas = 1;
            String tensionArterial = "#/#";
            boolean riesgoObstetrico = unoCero[0];
            boolean acidoFolico = unoCero[1];
            boolean sulfatoFerroso = unoCero[2];
            boolean vacTTD = unoCero[3];
            boolean vacTDPA = unoCero[4];
            boolean vacInfluenza = unoCero[5];
            boolean planSeguridad = false;
            int planificacionFamiliar = 1;
            String fechaEvento = "2024-11-09";
            boolean mujerPuerperio = false;
            String insert = "insert into PACIENTES (Jurisdiccion_Sanitaria, Coordinacion_Municipal, Unidad_Medica, Clave_Clues,"
                    + " Medico_Tratante, Apellido_Paterno, Apellido_Materno, Nombre, Calle, Numero_Exterior, Numero_Interior, Colonia,"
                    + " Localidad, Municipio, CURP, Edad, Telefono, Telefono_Familiar, Lengua_Indigena, Grado_Escolar, Seguro_social,"
                    + " Numero_Expediente, FUR, FPP, Numero_Partos, Numero_Cesareas, Numero_Abortos, Numero_Gestas,"
                    + " Tipo_Resolucion_Ultimo_Evento, Diagnostico_Actualizado, Numero_Consultas, Tension_Arterial, Riesgo_Obstetrico,"
                    + " Acido_Folico, Sulfato_Ferroso, VAC_TTD, VAC_TDPA, VAC_INFLUENZA, Plan_Seguridad, Planificacion_Familiar,"
                    + " Fecha_Evento_Obstetrico, Mujer_Puerperio) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, jurisdiccionSanitaria);
            ps.setString(2, coordinacionMunicipal);
            ps.setString(3, unidadMedica);
            ps.setString(4, claveClues);
            ps.setString(5, medicoTratante);
            ps.setString(6, aPaterno);
            ps.setString(7, aMaterno);
            ps.setString(8, nombres);
            ps.setString(9, calle);
            ps.setInt(10, noExt);
            ps.setInt(11, noInt);
            ps.setString(12, colonia);
            ps.setString(13, localidad);
            ps.setString(14, municipio);
            ps.setString(15, CURP);
            ps.setInt(16, edad);
            ps.setString(17, telefono);
            ps.setString(18, telefonoFamiliar);
            ps.setString(19, lenguaIndigena);
            ps.setInt(20, gradoEscolar);
            ps.setString(21, seguroSocial);
            ps.setString(22, numeroExpediente);
            ps.setString(23, FUR);
            ps.setString(24, FPP);
            ps.setInt(25, noPartos);
            ps.setInt(26, noCesareas);
            ps.setInt(27, noAbortos);
            ps.setInt(28, noGestas);
            ps.setInt(29, tipoResolucion);
            ps.setString(30, diagnosticoActualizado);
            ps.setInt(31, noConsultas);
            ps.setString(32, tensionArterial);
            ps.setBoolean(33, riesgoObstetrico);
            ps.setBoolean(34, acidoFolico);
            ps.setBoolean(35, sulfatoFerroso);
            ps.setBoolean(36, vacTTD);
            ps.setBoolean(37, vacTDPA);
            ps.setBoolean(38, vacInfluenza);
            ps.setBoolean(39, planSeguridad);
            ps.setInt(40, planificacionFamiliar);
            ps.setString(41, fechaEvento);
            ps.setBoolean(42, mujerPuerperio);
            int filasAfectadas = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
    }

    public void actualizarConsulta (int id, String medicoTratante, String diagnostico, String fecha, boolean[] arreglo2){
        try {
           String query = "SELECT ID FROM MEDICOS WHERE Nombres = ?";
            PreparedStatement psMedico = con.prepareStatement(query);
            psMedico.setString(1, medicoTratante);
            rs2 = psMedico.executeQuery();
            rs2.next();
            int idMedico = rs2.getInt("ID");
            String update = "UPDATE PACIENTES SET Medico_Tratante = ?, Diagnostico_Actualizado = ?, FPP = ?, Riesgo_Obstetrico = ?, Acido_Folico = ?, Sulfato_Ferroso = ?, VAC_TTD = ?, VAC_TDPA = ?, VAC_INFLUENZA = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(update);
            ps.setInt(1, idMedico);
            ps.setString(2, diagnostico);

            if (fecha == null || fecha.isEmpty()) {
                ps.setNull(3, java.sql.Types.DATE);
            } else {
                java.sql.Date sqlDate = java.sql.Date.valueOf(fecha);
                ps.setDate(3, sqlDate);
            }

            ps.setBoolean(4, arreglo2[0]);
            ps.setBoolean(5, arreglo2[1]);
            ps.setBoolean(6, arreglo2[2]);
            ps.setBoolean(7, arreglo2[3]);
            ps.setBoolean(8, arreglo2[4]);
            ps.setBoolean(9, arreglo2[5]);
            ps.setInt(10, id);

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean EdadConsulta(String nombret, String curp, String telefono, String edad) {
//        boolean edad0 = false, numero0 = false, curp0 = false, nombre0 = false;
//        try {
//
//            rs = st.executeQuery("SELECT ID, Apellido_Paterno, Apellido_Materno, Nombre, Edad, Telefono, CURP from PACIENTES");
//            while (rs.next()) {
//                int ids = rs.getInt("ID");
//                String apellidoPaterno = rs.getString("Apellido_Paterno");
//                String apellidoMaterno = rs.getString("Apellido_Materno");
//                String nombre = rs.getString("Nombre");
//                int edadd = rs.getInt("Edad");
//                String telephone = rs.getString("Telefono");
//                String curpsito = rs.getString("CURP");
//
//                String nombreIngresado = apellidoPaterno + " " + apellidoMaterno + " " + nombre;
//
//                if (nombret.trim().equals(nombreIngresado)) {
//                    nombre0 = true;
//                    System.out.println("buen pitote1 1");
//                }
//                if (edad.equals(String.valueOf(edadd))) {
//                    edad0 = true;
//                    System.out.println("buen pitotoe 2");
//                }
//                if (telefono.equals(telephone)) {
//                    numero0 = true;
//                    System.out.println("buen pitote3");
//                }
//                if (curp.equals(curpsito)) {
//                    curp0 = true;
//                    System.out.println("buen pitote4");
//                }
//                if (edad0 && numero0 && curp0 && nombre0) {
//                    id = ids;
//                    System.out.println("se pudo");
//                    return true;
//                } else {
//                    System.out.println("no se puddooo");
//                    return false;
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
 boolean encontrado = false;
    try {
        rs = st.executeQuery("SELECT ID, Apellido_Paterno, Apellido_Materno, Nombre, Edad, Telefono, CURP FROM PACIENTES");
        while (rs.next()) {
            int ids = rs.getInt("ID");
            String apellidoPaterno = rs.getString("Apellido_Paterno");
            String apellidoMaterno = rs.getString("Apellido_Materno");
            String nombre = rs.getString("Nombre");
            int edadd = rs.getInt("Edad");
            String telephone = rs.getString("Telefono");
            String curpsito = rs.getString("CURP");

            String nombreIngresado = apellidoPaterno + " " + apellidoMaterno + " " + nombre;

            boolean nombre0 = nombret.trim().equals(nombreIngresado);
            boolean edad0 = edad.equals(String.valueOf(edadd));
            boolean numero0 = telefono.equals(telephone);
            boolean curp0 = curp.equals(curpsito);

            if (nombre0 && edad0 && numero0 && curp0) {
                id = ids;
                encontrado = true;
                break; // Si se encuentra un registro coincidente, salir del bucle
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }
        return encontrado;
    }

    public String ConsultaFecha(int id) {
        String fechaFormateada = "";
        try {
            rs = st.executeQuery("Select FPP From PACIENTES Where ID ='" + String.valueOf(id) + "';");
            while (rs.next()) {
                java.util.Date fecha = rs.getDate("FPP");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                fechaFormateada = sdf.format(fecha);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaFormateada;

    }
}
