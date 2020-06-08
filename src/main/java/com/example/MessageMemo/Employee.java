package com.example.MessageMemo;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="M_EMPLOYEE")
//クラス　Employeeを作成
public class Employee {
	@Id
	//カラム名E_NUM作成　文字列型e_num
	@Column(name="E_NUM" ,columnDefinition = "VARCHAR(5)")
	private String e_num;
	//カラム名E_NAME作成　文字列型e_name
	@Column(name="E_NAME" ,nullable = false ,columnDefinition = "VARCHAR(40)")
	private String e_name;
	//カラム名E_YEAR作成　int型(数字)e_num
	@Column(name="E_YEAR" ,columnDefinition = "INT(11)")
	private int e_year;
	//カラム名DEPART_CD作成　文字列型depart_cd
	@Column(name="DEPART_CD" ,columnDefinition = "CHAR(2)")
	private String depart_cd; 

	//カラム名UPDATE_DATE作成　timestamp型（日付と時刻の格納）update_date
	@Column(name="UPDATE_DATE" ,columnDefinition = "datetime")
	private Timestamp update_date;
	//カラム名UPDATE_USER作成　文字列型　update_user
	@Column(name="UPDATE_USER" ,columnDefinition = "VARCHAR(40)")
	private String update_user;
	//カラム名CREATE_DATE作成　timestamp型（日付と時刻の格納）create_date
	@Column(name="CREATE_DATE" ,columnDefinition = "datetime")
	private Timestamp create_date;
	//カラム名CREATE_USER作成　文字列型create_user
	@Column(name="CREATE_USER" ,columnDefinition = "VARCHAR(40)")
	//フィールドにcreat_userを作成
	private String create_user;
	//e_numの値を取得
	public String getE_num() {
		return e_num;
	}
	//e_numの値の設定
	public void setE_num(String e_num) {
		this.e_num = e_num;
	}
	//e_nameの値を取得
	public String getE_name() {
		return e_name;
	}
	//e_nameの値の設定
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	//e_yearの値を取得
	public int getE_year() {
		return e_year;
	}
	//e_yearの値の設定
	public void setE_year(int e_year) {
		this.e_year = e_year;
	}	
	//depart_cdの値を取得
	public String getDepart_cd() {
		return depart_cd;
	}
	//depart_cdの値の設定
	public void setDepart_cd(String depart_cd) {
		this.depart_cd = depart_cd;
	}	
	//e_num,e_name.e_year,depart_cdmの値の設定
	public void setAll(  String e_num
						,String e_name
						,int e_year
						,String depart_cd
						) {
		this.e_num = e_num;
		this.e_name = e_name;
		this.e_year = e_year;
		this.depart_cd = depart_cd;
	}

		//creat_dateの値を取得
		public Timestamp getCreate_date() {
			return create_date;
		}
		//creat_dateの値を設定
		public void setCreate_date(Timestamp create_date) {
			this.create_date = create_date;
		}
		//creat_userの値を取得
		public String getCreate_user() {
			return create_user;
		}
		//creat_uearの値を設定
		public void setCreate_user(String create_user) {
			this.create_user = create_user;
		}
		//update_dateの値を取得
		public Timestamp getUpdate_date() {
			return update_date;
		}
		//update_dateの値を設定
		public void setUpdate_date(Timestamp update_date) {
			this.update_date = update_date;
		}
		//update_userの値を取得
		public String getUpdate_user() {
			return update_user;
		}
		//update_userの値を設定
		public void setUpdate_user(String update_user) {
			this.update_user = update_user;
		}

}
