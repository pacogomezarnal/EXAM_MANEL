package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModCad {
	private final static String SEL_CADS = "select * from cadetes;";
	private final static String SEL_TEAM = "select * from cadetes where equipo=5;";
	private Connection conexion = null;// maneja la conexió
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;

	public ModCad() {
		conexion = ConexionDB.getConexion();
	}

	public ArrayList<Cadete> getCadetes() {
		ArrayList<Cadete> cads = new ArrayList<Cadete>();
		try {
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(SEL_CADS);
			while (conjuntoResultados.next()) {
				Cadete c = new Cadete(conjuntoResultados.getInt("id"),
						conjuntoResultados.getString("nombre"),
						conjuntoResultados.getString("apellidos"),
						conjuntoResultados.getInt("edad"),
						conjuntoResultados.getString("nacionalidad"),
						conjuntoResultados.getShort("equipo"));
				cads.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cads;
	}

	public ArrayList<Cadete> getEquips() {
		ArrayList<Cadete> equips = new ArrayList<Cadete>();
		try {
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(SEL_TEAM);
			while (conjuntoResultados.next()) {
				Cadete c = new Cadete(conjuntoResultados.getInt("id"),
						conjuntoResultados.getString("nombre"),
						conjuntoResultados.getString("apellidos"),
						conjuntoResultados.getInt("edad"),
						conjuntoResultados.getString("nacionalidad"),
						conjuntoResultados.getShort("equipo"));
				equips.add(c);
				System.out.println("Tens a "+c.getNombre());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equips;
	}
}
