var appv=new Vue({
    el: '#app',
    data: {
        pelicula:{
            id:'',
            nombre:'',
            duracion:'',
            genero:'',
            portada:''

        },
        peliculas:[]
    },
    methods: {
        
        verPeliculas(id_cine){
            const params={id:id_cine}
            axios.get('/Cine/Peliculas?id=1').then(
                res=>{
                    this.peliculas=res.data;
                    //alert(res.data)
                
                }
                    
                );
            
        },
    },
  })