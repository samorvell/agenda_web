$('#confirmaExclusaoModal').on('show.bs.modal', function(event)){
	var button = $(event.relatedTarget);
	
	var codigoTitulo = button.data('codigo');
	
	var modal = $(this);
	var form= modal.find('form');
	var action = form.attr('action');
	
	if (action.endWith('/')){
		action += '/;'
	}
	
	from.attr('action',action+ codigoTitulo);
	



}


