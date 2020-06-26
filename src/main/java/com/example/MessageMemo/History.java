package com.example.MessageMemo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class History {
	@Id
	private int m_id;
	private Timestamp receiv_time; 
	private String to_name;
	private String c_name;
	private String e_name;
	private String sender;
	private String message_cd;
	
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
	//e_nameの値を取得
	public String getE_name() {
		return e_name;
	}
	//e_nameの値の設定
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	//C_ameの値を取得
	public String getC_name() {
		return c_name;
	}
	//C_nameの値を設定
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	//To_nameの値を設定
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	
	//Receiv_timeの値を取得
	public String getReceiv_time() {
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd/HH:mm");
		String receiv_time = simpledateformat.format(this.receiv_time);
		return receiv_time;
	}
	//Receiv_timeの値を設定
	public void setReceiv_time(Timestamp receiv_time) {
		this.receiv_time = receiv_time;
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
		if(message_cd.equals("1")) {
			setMessage_cd("もう一度お願いします");
		}else if(message_cd.equals("2")) {
			setMessage_cd("折り返しお願いします");
		}else if(message_cd.equals("3")){
			setMessage_cd("伝言あります");
		}
		return message_cd;
	}
	//Message_cdの値を設定
	public void setMessage_cd(String message_cd) {
		
		this.message_cd = message_cd;
	}
	
}
	
//	//m_id,to_name,receiver_cd,custmer_cd,sender,message_cd,memoの値を設定
//	public void setAll(  int m_id
//						,String to_name
//						,String c_name
//						,String receiver_cd
//						,String custmer_cd
//						,String sender
//						,String message_cd
//						,String memo
//						,String e_name
//						) {
//		this.m_id = m_id;
//		this.to_name = to_name;
//		this.c_name= c_name;
//		this.receiver_cd = receiver_cd;
//		this.custmer_cd = custmer_cd;
//		this.sender = sender;
//		this.message_cd = message_cd;
//		this.memo = memo;
//		this.e_name = e_name;
//	}
//	
//	
//	//creat_dateの値を取得
//	public Timestamp getCreate_date() {
//		return create_date;
//	}
//	//creat_dateの値を設定
//	public void setCreate_date(Timestamp create_date) {
//		this.create_date = create_date;
//	}
//	//creat_userの値を取得
//	public String getCreate_user() {
//		return create_user;
//	}
//	//creat_uearの値を設定
//	public void setCreate_user(String create_user) {
//		this.create_user = create_user;
//	}
//	//update_dateの値を取得
//	public Timestamp getUpdate_date() {
//		return update_date;
//	}
//	//update_dateの値を設定
//	public void setUpdate_date(Timestamp update_date) {
//		this.update_date = update_date;
//	}
//	//update_userの値を取得
//	public String getUpdate_user() {
//		return update_user;
//	}
//	//update_userの値を設定
//	public void setUpdate_user(String update_user) {
//		this.update_user = update_user;
//	}
//
//}

