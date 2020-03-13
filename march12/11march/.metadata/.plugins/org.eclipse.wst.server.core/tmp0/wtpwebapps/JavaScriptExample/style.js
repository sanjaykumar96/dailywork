
		function sayHello() {
			document.write("<h1> hello baba </h1>");
			document.write("<h1>" +Date() +"</h1>");
		}
		
		function validate() {
			
			var name=document.if.userName.value.trim();
			var password=document.if.pwd.value.trim();
			if(name==""){
				alert("userName should not be empty");
				return false;
			}
			if(password==""){
				alert("password should not be empty");
				return false;
			}
		}
	