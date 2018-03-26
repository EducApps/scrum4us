export class Settings {

  static buildDtOptions(numPages: number, lengthValue: boolean ): DataTables.Settings {
    return {
      destroy: true,
      pagingType: 'full_numbers',
      pageLength: numPages,
      lengthChange: lengthValue,
      language: {
        processing: 'Processando...',
        search: 'Pesquisar',
        lengthMenu: '_MENU_ resultados por página',
        info: 'Mostrando de _START_ até _END_ de _TOTAL_ registros',
        infoEmpty: 'Mostrando 0 até 0 de 0 registros',
        infoFiltered: '(Filtrados de _MAX_ registros)',
        infoPostFix: '',
        loadingRecords: 'Carregando...',
        zeroRecords: 'Nenhum registro encontrado',
        emptyTable: 'Nenhum registro encontrado',
        paginate: {
          first: 'Primeiro',
          previous: 'Anterior',
          next: 'Próximo',
          last: 'Último'
        },
        aria: {
          sortAscending: ': Ordenar colunas de forma ascendente',
          sortDescending: ': Ordenar colunas de forma descendente'
        }
      },
      // responsive: true
    };
  }
}
