/**
 * 
 */

/**
 * @param  유효성검사는 마지막에 확인후 주석걸고 
 * @returns
 */
function registerForm(obj) {
	// alert("ok");

	if (obj.id.value == "") {
		window.alert("아이디를 입력하세요.");
		obj.id.focus();
		return false;
	}
	
	if (obj.password.value == ""){
		window.alert("비밀번호를 입력하세요.");
		obj.password.focus();
		return false;
	}
	
	if (obj.passwordCheck.value != obj.password.value){
		window.alert("비밀번호를가 같지 않습니다.");
		obj.passwordCheck.focus();
		return false;
	}
	
	if (obj.name.value == ""){
		window.alert("이름을 입력하세요.");
		obj.name.focus();
		return false;
	}
	
	if (obj.jumin1.value == ""){
		window.alert("앞 주민번호를 입력하세요.");
		obj.jumin1.focus();
		return false;
	}
	
	if (obj.jumin2.value == ""){
		window.alert("뒷 주민번호를 입력하세요.");
		obj.jumin2.focus();
		return false;
	}
	
	if (obj.email.value == ""){
		window.alert("이메일 번호를 입력해주세요.");
		obj.email.focus();
		return false;
	}
	
	if (obj.zipcode.value == ""){
		window.alert("우편번호를 입력해주세요.");
		obj.zipcode.focus();
		return false;
	}
	
	if (obj.address.value == ""){
		window.alert("주소를 입력해주세요.");
		obj.address.focus();
		return false;
	}
	
	
	var check = false;
	for (var i = 0; i < obj.mailing.length; i++) {
		if (obj.mailing[i].checked == true)
			check = true;

	}
	if (check == false) {
		alert("반드시 하나는 체크하세요");
		return false;
	}
	var str = "";
	var count = 0;
	for (var i = 0; i < obj.interestValue.length; i++) {
		if (obj.interestValue[i].checked == true) {
			str += obj.interestValue[i].value + ",";
			++count;
		}
//		alert(str);
	}
	obj.interest.value=str;
	
	if (count == 0) {
		alert("반드시 하나는 체크하세요");
		return false;
	}
}

function idCheck(obj, root) {
	// alert(obj.id.value);

	if (obj.id.value == "") {
		alert("아이디를 반드시 입력하세요.");
		obj.id.focus();
		return false;
	}

	var url = root + "/member/idCheck.do?id=" + obj.id.value;
	// alert(url);

	open(url, "", "width=400,height=200 scrollbars=yes");
}

function zipcodeRead(root) {
	var url = root + "/member/zipcode.do";
	// alert(url);
	open(url, "", "width=400,height=400,scrollbars=yes");

}

function sendAddress(zipcode, sido, gugun, dong, ri, bunji) {
	var address = sido + gugun + dong + ri + bunji;
	// alert(zipcode+","+address);

	opener.creatForm.zipcode.value = zipcode; 
	opener.creatForm.address.value = address;
	self.close();
}