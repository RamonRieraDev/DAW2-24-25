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
  
  // agregar productos a la lista
  agregarProductos();
  console.log("hola");
  