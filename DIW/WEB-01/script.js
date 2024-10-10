// datos de productos
const productos = [
    {
      id: 1,
      nombre: "Guitarra eléctrica Epiphone Les Paul Special II",
      precio: 129,
      imagen: "imagenes/epiphone-les-paul-special-ii.jpg",
      descripcion: "La Epiphone Les Paul Special II es una guitarra eléctrica de alta calidad con un cuerpo de tilo y un mástil de arce."
    },
    {
      id: 2,
      nombre: "Batería Pearl Reference 22\"",
      precio: 999,
      imagen: "imagenes/pearl-reference-22.jpg",
      descripcion: "La Pearl Reference 22\" es una batería de alta calidad con un sonido claro y potente."
    },
    {
      id: 3,
      nombre: "Piano digital Yamaha P-125",
      precio: 499,
      imagen: "imagenes/yamaha-p-125.jpg",
      descripcion: "El Yamaha P-125 es un piano digital de alta calidad con un sonido realista y una gran variedad de funciones."
    },
    {
      id: 4,
      nombre: "Amplificador de guitarra Marshall DSL40C",
      precio: 299,
      imagen: "imagenes/marshall-dsl40c.jpg",
      descripcion: "El Marshall DSL40C es un amplificador de guitarra de alta calidad con un sonido claro y potente."
    },
    {
      id: 5,
      nombre: "Micrófono Shure SM57",
      precio: 99,
      imagen: "imagenes/shure-sm57.jpg",
      descripcion: "El Shure SM57 es un micrófono dinámico de alta calidad con un sonido claro y resistente."
    }
  ];
  
  // función para agregar productos a la lista
  function agregarProductos() {
    const listaProductos = document.getElementById("lista-productos");
    productos.forEach((producto) => {
      const elemento = document.createElement("li");
      elemento.classList.add("producto");
      elemento.innerHTML = `
        <img src="${producto.imagen}" alt="${producto.nombre}">
        <h3>${producto.nombre}</h3>
        <p>Precio: ${producto.precio}€</p>
        <p>${producto.descripcion}</p>
      `;
      listaProductos.appendChild(elemento);
    });
  }

  // datos de noticias
  const noticias = [
    {
      id: 1,
      titulo: "Ableton Move, una groovebox portable hermanada con Live",
      imagen: "imagenes/move.jqg.avif",
      contenido: "Lejos de Push 3, Move es una forma asequible de disponer de un bien concebido entorno para generar ideas 'electro' en cualquier lugar, usando percusión, sintes VA y wavetable y sampler. Permite una experiencia muy estilo 'Live' a pequeña escala y en portabilidad extrema. Su conexión con Live (exportación de proyectos y uso como controlador Live) facilita ir más allá, sea con Live Intro incluido o alguna otra licencia"
    },
    {
      id:2,
      titulo: "Noticia 2",
      imagen: "noticias/noticia2.jpg",
      contenido: "Contenido de la noticia 2"
    },
    {
      id:3,
      titulo: "Noticia 3",
      imagen: "noticias/noticia3.jpg",
      contenido: "Contenido de la noticia 3"  
    }
  ];

  // función para agregar noticias a la lista
  function agregarNoticias() {  
    const listaNoticias = document.getElementById("lista-noticias");
    noticias.forEach((noticia) => {
      const elemento = document.createElement("li");
      elemento.classList.add("noticia");
      elemento.innerHTML = `
        <img src="${noticia.imagen}" alt="${noticia.titulo}">
        <h3>${noticia.titulo}</h3>
        <p>${noticia.contenido}</p>
      `;
      listaNoticias.appendChild(elemento);
    });
  }   

  // agregar productos a la lista
  agregarProductos();

  // agregar noticias a la lista
  agregarNoticias();

  console.log("test");
  