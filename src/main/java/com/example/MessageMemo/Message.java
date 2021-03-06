package com.example.MessageMemo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_MESSAGE")
//Customerクラス作成
public class Message {
	@Id
	//カラム名M_ID作成　int型m_id
	@Column(name="M_ID" ,nullable = false ,columnDefinition = "int(11)")
	private int m_id;
	//カラム名TO_NAME作成　文字列型to_name
	@Column(name="TO_NAME" ,nullable = false ,columnDefinition = "VARCHAR(40)")
	private String to_name;
	//カラム名RECEIVER_CD作成　文字列型receiver_cd
	@Column(name="RECEIVER_CD" ,nullable = false ,columnDefinition = "VARCHAR(5)")
	private String receiver_cd;
	//カラム名RECEIV_TIME作成　Timestamp型receiv_time
	@Column(name="RECEIV_TIME" ,nullable = false ,columnDefinition = "datetime")
	private Timestamp receiv_time; 
	//カラム名CUSTMER_CD作成　文字列型custmer_cd
	@Column(name="CUSTMER_CD" ,columnDefinition = "VARCHAR(4)")
	private String custmer_cd;
	//カラム名SENDER作成　文字列型sender
	@Column(name="SENDER" ,nullable = false ,columnDefinition = "VARCHAR(40)")
	private String sender;
	//カラム名MESSAGE_CD作成　文字列型message_cd
	@Column(name="MESSAGE_CD" ,nullable = false ,columnDefinition = "char(1)")
	private String message_cd;
	//カラム名MEMO作成　文字列型memo
	@Column(name="MEMO" ,columnDefinition = "VARCHAR(256)")
	private String memo; 
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
	//M_idの値を取得
	public int getM_id() {
		return m_id;
	}
	//M_idの値を設定
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	//To_nameの値を取得
	public String getTo_name() {
		return to_name;
	}
	//To_nameの値を設定
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	//Receiver_cdの値を取得
	public String getReceiver_cd() {
		return receiver_cd;
	}
	//Receiver_cdの値を設定
	public void setReceiver_cd(String receiver_cd) {
		this.receiver_cd = receiver_cd;
	}
	//Receiv_timeの値を取得
	public Timestamp getReceiv_time() {
		return receiv_time;
	}
	//Receiv_timeの値を設定
	public void setReceiv_time(Timestamp receiv_time) {
		this.receiv_time = receiv_time;
	}	
	//Custmer_cdの値を取得
	public String getCustmer_cd() {
		return custmer_cd;
	}
	//Custmer_cdの値を設定
	public void seCustmer_cd(String custmer_cd) {
		this.custmer_cd = custmer_cd;
	}
	//Senderの値を取得
	public String getSender() {
		return sender;
	}
	//Senderの値を設定
	public void setSender(String sender) {
		this.sender = sender;
	}
	//Message_cdの値を取得
	public String getMessage_cd() {
		return message_cd;
	}
	//Message_cdの値を設定
	public void setMessage_cd(String message_cd) {
		this.message_cd = message_cd;
	}
	//Memoの値を取得
	public String getMemo() {
		return memo;
	}
	//Memoの値を設定
	public void setMemo(String memo) {
		this.memo = memo;
	}
	//m_id,to_name,receiver_cd,custmer_cd,sender,message_cd,memoの値を設定
	public void setAll(  int m_id
						,String to_name
						,String receiver_cd
						,String custmer_cd
						,String sender
						,String message_cd
						,String memo
						) {
		this.m_id = m_id;
		this.to_name = to_name;
		this.receiver_cd = receiver_cd;
		this.custmer_cd = custmer_cd;
		this.sender = sender;
		this.message_cd = message_cd;
		this.memo = memo;
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
