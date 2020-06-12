function setDate() {
    let today = new Date();
    let nowYear = today.getFullYear();
    let nowMonth = today.getMonth() + 1;
    let nowDay = today.getDate();

    document.getElementById("today_year").value = nowYear;
    document.getElementById("today_month").value = nowMonth;
    document.getElementById("today_day").value = nowDay;
}
function setTime() {
    let today = new Date();
    let hours = today.getHours();
    let minutes = today.getMinutes(); 

    document.getElementById("hour").value = hours;
    document.getElementById("minute").value = minutes;

    // 13時以降の場合
    if (hours > 12) {
        document.getElementById("hour").value = hours - 12;
    } else if (hours == 0) {
        document.getElementById("hour").value = 12;
    } else {
        document.getElementById("hour").value = hours;
    }

    // AM・PMのチェック
    if (hours >= 0 && hours <= 11) {
        document.getElementById("AM").checked = true;
    } else if(hours >= 12 && hours <= 23) {
        document.getElementById("PM").checked = true;
    }
}
    //印刷ボタン
    document.getElementById("print").onclick = function() {
        window.print();  
}

//ちえっく単品
function checkbox(){
    document.forms['form'].elements['check1'].onclick=ckbox1;
    document.forms['form'].elements['check2'].onclick=ckbox2;
    document.forms['form'].elements['check3'].onclick=ckbox3;
}
function ckbox1(){
    document.forms['form'].elements['check2'].checked=false;
    document.forms['form'].elements['check3'].checked=false;
    changeReadOnly();
    changerequired();
    memo.value="";
 }
 function ckbox2(){
    document.forms['form'].elements['check1'].checked=false;
    document.forms['form'].elements['check3'].checked=false;
    changeReadOnly();
    changerequired();
    memo.value="";
 }
 function ckbox3(){
    document.forms['form'].elements['check1'].checked=false;
    document.forms['form'].elements['check2'].checked=false;
    changeReadOnly();
    changerequired();
 }
  window.addEventListener('DOMContentLoaded',checkbox,false);

//「伝言あります」にチェックされた場合、入力可能
    function changeReadOnly(){
        let obj = document.getElementById("check3");
        let result =obj.checked
        let ob = document.getElementById("memo");
        if(result == true){
          ob.readOnly = false;  //readonlyを解除
        }else{
          ob.readOnly = true;   //readonlyに設定
        }
    }

    function changerequired(){
        let obj = document.getElementById("check3");
        let result =obj.checked
        let ob = document.getElementById("memo");
        if(result == true){
          ob.required = true;  //readonlyに設定
        }else{
          ob.required = false;   //requiredに解除
        }
    }
    
    function isCheck() {
    	document.getElementById("msg-coment").innerHTML="";
    	var arr_check = document.getElementsByClassName("check");
    	var count = 0;
    	for (var i = 0; i < arr_check.length; i++) {
    		if (arr_check[i].checked) {
    			count++;
    		}
    	}
    	if (count > 0) {
    		document.getElementById("c-coment").innerHTML="";
    		return true;
    	} else {
    		
    		document.getElementById("c-coment").innerHTML="対応のいずれかをチェックしてください";
    		return false;
    	}
    }
    