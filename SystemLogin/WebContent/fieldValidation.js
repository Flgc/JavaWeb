function loginValidation(){
	if(document.loginform.txtUser.value==""){
		alert("User name empty!");
		return false;
	};

	if(document.loginform.txtPassword.value==""){
		alert("User password empty!");
		return false;
	};
	
	document.loginform.submit();
}