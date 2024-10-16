// Productos globales
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

  
  // Función para guardar el carrito en LocalStorage
  function guardarCarrito() {
    localStorage.setItem('carrito', JSON.stringify(carrito));
  }
  
  // Función para cargar el carrito desde LocalStorage
  function cargarCarrito() {
    const carritoGuardado = localStorage.getItem('carrito');
    if (carritoGuardado) {
      carrito = JSON.parse(carritoGuardado);
    } else {
      carrito = [];
    }
  }
  
  // Función para agregar productos al carrito
  function agregarAlCarrito(idProducto) {
    const producto = productos.find((p) => p.id === idProducto);
    carrito.push(producto);
    guardarCarrito(); // Guardar el carrito actualizado en LocalStorage
    mostrarCarrito(); // Actualizar la lista del carrito
    actualizarTotal(); // Actualizar el total
  }
  
  // Función para mostrar productos en el carrito
  function mostrarCarrito() {
    const listaCarrito = document.getElementById("lista-carrito");
    if (!listaCarrito) return; // Verificar si estamos en la página del carrito
  
    listaCarrito.innerHTML = "";
    carrito.forEach((producto, index) => {
      const elemento = document.createElement("li");
      elemento.innerHTML = `
        <img src="${producto.imagen}" alt="${producto.nombre}" style="width: 50px;">
        <span>${producto.nombre} - ${producto.precio}€</span>
        <button onclick="eliminarDelCarrito(${index})">Eliminar</button>
      `;
      listaCarrito.appendChild(elemento);
    });
  }
  
  // Función para eliminar productos del carrito
  function eliminarDelCarrito(indice) {
    carrito.splice(indice, 1); // Elimina el producto del carrito
    guardarCarrito(); // Guardar el carrito actualizado en LocalStorage
    mostrarCarrito(); // Actualizar la lista del carrito
    actualizarTotal(); // Actualizar el total
  }
  
  // Función para calcular y mostrar el total del carrito
  function actualizarTotal() {
    const total = carrito.reduce((acumulador, producto) => acumulador + producto.precio, 0);
    const elementoTotal = document.getElementById("total-carrito");
    if (elementoTotal) {
      elementoTotal.textContent = `Total: ${total}€`;
    }
  }
  
  // Cargar el carrito al iniciar
  cargarCarrito();
  