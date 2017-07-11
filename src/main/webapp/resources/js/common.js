function checkInputEmpty($obj){
	var count = 0;
	$obj.each(function(i, element){
		var $next = $(element).next(".errorMsg");
		if( $(element).val() == ""){
			$next.css("display","block");
			count++;
		} else {
			$next.css("display","none");
		}		
	});

	if(count > 0){
		return false;
	}

	return true; 
}
