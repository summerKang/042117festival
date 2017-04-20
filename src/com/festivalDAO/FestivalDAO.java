package com.festivalDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.festivalVO.FestivalVO;

public class FestivalDAO {
	DataSource ds;

	public FestivalDAO() throws NamingException {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		ds = (DataSource) envContext.lookup("jdbc/myoracle");
	}

	public ArrayList<FestivalVO> getAllInfo() throws SQLException {
		ArrayList<FestivalVO> array1 = new ArrayList<FestivalVO>();
		Connection conn = ds.getConnection();
		PreparedStatement ps1;
		ResultSet rs1;

		String sql = "SELECT fnum, fname, city, sdate, edate, capa, ftel, home"
				+" from festival order by 1";

		ps1 = conn.prepareStatement(sql);
		rs1 = ps1.executeQuery();
		while (rs1.next()) {
			int fnum = rs1.getInt("fnum");
			String fname = rs1.getString("fname");
			String city = rs1.getString("city");
			Date sdate = rs1.getDate("sdate");
			Date edate = rs1.getDate("edate");
			int capa = rs1.getInt("capa");
			String ftel = rs1.getString("ftel");
			String home = rs1.getString("home");

			FestivalVO svo1 = new FestivalVO(fnum, fname, city, sdate, edate, capa, ftel, home);
			array1.add(svo1);
		}
		return array1;
	}

	public void insert_fes(String fname, String city, String sdate, String edate, String capa, String ftel, String home)
			throws SQLException {
		Connection conn = ds.getConnection();
		PreparedStatement ps1;

		String sql = "insert into festival values"
				+" (fes1.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		

		ps1 = conn.prepareStatement(sql);
		ps1.setString(1, fname);
		ps1.setString(2, city);
		ps1.setString(3, sdate);
		ps1.setString(4, edate);
		ps1.setInt(5, Integer.parseInt(capa));
		ps1.setString(6, ftel);
		ps1.setString(7, home);

		ps1.executeUpdate();
	}

	public FestivalVO search_fes(String fnum) throws SQLException {
		Connection conn = ds.getConnection();
		PreparedStatement ps1;
		ResultSet rs1;

		FestivalVO sv1 = new FestivalVO();
		String sql = "SELECT * FROM festival where fnum=?";
		ps1 = conn.prepareStatement(sql);
		ps1.setInt(1, Integer.parseInt(fnum));
		rs1 = ps1.executeQuery();
		if (rs1.next()) {
			String fname = rs1.getString("fname");
			String city = rs1.getString("city");
			Date sdate = rs1.getDate("sdate");
			Date edate = rs1.getDate("edate");
			int capa = rs1.getInt("capa");
			String ftel = rs1.getString("ftel");
			String home = rs1.getString("home");
			
			sv1.setFnum(Integer.parseInt(fnum));
			sv1.setFname(fname);
			sv1.setCity(city);
			sv1.setSdate(sdate);
			sv1.setEdate(edate);
			sv1.setCapa(capa);
			sv1.setFtel(ftel);
			sv1.setHome(home);
		} else {
			sv1 = null;
		}
		return sv1;
	}

	public void update_fes(String fnum, String fname, String city, String sdate, String edate, String capa, String ftel, String home)
			throws SQLException {
		Connection conn = ds.getConnection();
		PreparedStatement ps1;

		String sql = "update festival set fname=?, city=?, sdate=?, edate=?, capa=?, ftel=?, home=? where fnum=?";

			ps1 = conn.prepareStatement(sql);
			ps1.setString(1, fname);
			ps1.setString(2, city);
			ps1.setString(3, sdate);
			ps1.setString(4, edate);
			ps1.setInt(5, Integer.parseInt(capa));
			ps1.setString(6, ftel);
			ps1.setString(7, home);
			ps1.setInt(8, Integer.parseInt(fnum));
			
			ps1.executeUpdate();
		
	}

	public void delete_fes(String d_fnum) throws SQLException {
		Connection conn = ds.getConnection();
		PreparedStatement ps1;

		String sql = "delete festival where fnum=?";

		try {
			ps1 = conn.prepareStatement(sql);
			ps1.setString(1, d_fnum);
			ps1.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update Exception");
		}
	}
	
}
