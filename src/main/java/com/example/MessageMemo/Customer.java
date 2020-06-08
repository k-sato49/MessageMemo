package com.example.MessageMemo;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="M_CUSTOMER")
//Customerクラス作成
public class Customer {
	@Id
	//カラム名C_CD作成　文字列型c_num
	@Column(name="C_CD" ,columnDefinition = "VARCHAR(4)")
	private String c_num;
	//カラム名C_NAME作成　文字列型c_name
	@Column(name="C_NAME" ,nullable = false ,columnDefinition = "VARCHAR(100)")
	private String c_name;
	//カラム名ADDRESS作成　文字列型address
	@Column(name="ADDRESS" ,columnDefinition = "VARCHAR(256)")
	private String address;
	//カラム名TEL作成　文字列型TEL
	@Column(name="TEL" ,columnDefinition = "VARCHAR(11)")
	private String tel; 
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
	//C_numの値を取得
	public String getC_num() {
		return c_num;
	}
	//C_numの値を設定
	public void setC_num(String c_num) {
		this.c_num = c_num;
	}
	//C_ameの値を取得
	public String getC_name() {
		return c_name;
	}
	//C_nameの値を設定
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	//Addressの値を取得
	public String getAddress() {
		return address;
	}
	//Addressの値を設定
	public void setAddress(String address) {
		this.address = address;
	}
	//Telの値を取得
	public String getTel() {
		return tel;
	}
	//Telの値を設定
	public void setTel(String tel) {
		this.tel = tel;
	}	
	//c_num,c_name,address,telの値を設定
	public void setAll(  String c_num
						,String c_name
						,String address
						,String tel
						) {
		this.c_num = c_num;
		this.c_name = c_name;
		this.address = address;
		this.tel = tel;
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
