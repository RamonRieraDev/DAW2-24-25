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

// datos de noticias
const noticias = [
  {
    id: 1,
    titulo: "Ableton Move, una groovebox portable hermanada con Live",
    imagen: "imagenes/move.jqg.avif",
    contenido: "Lejos de Push 3, Move es una forma asequible de disponer de un bien concebido entorno para generar ideas 'electro' en cualquier lugar, usando percusión, sintes VA y wavetable y sampler. Permite una experiencia muy estilo 'Live' a pequeña escala y en portabilidad extrema. Su conexión con Live (exportación de proyectos y uso como controlador Live) facilita ir más allá, sea con Live Intro incluido o alguna otra licencia"
  },
  {
    id: 2,
    titulo: "Ableton Push 3: Live sin ordenador en hardware 100% autónomo",
    imagen: "imagenes/push3.jpg",
    contenido: "El futuro ha llegado. Enorme salto el que da Push 3 en cualquiera de sus dos variantes. Sumando únicamente los pads 3D para interpretación MPE, el interfaz audio que incorpora, y su uso como controlador, diría que el precio mejora (aunque sea más alto) el de Push 2. La versión 'standalone' dobla el desembolso para quienes quieran usar Live sin ordenador, pero a cambio permite disponer del sistema comercial más potente que conocemos en este tipo de dispositivos, disfrutando de un Live sin restricciones en un equipo 100% autónomo y tremendamente versátil."
  },
  {
    id: 3,
    titulo: "Review de Arturia Minilab 3, acertada renovación para un completo controlador MIDI",
    imagen: "imagenes/minilab3.jpg",
    contenido: "La experiencia de Arturia en controladores es ya dilatada, y ha permitido concebir una combinación que veo particularmente interesante en sus resultados, dentro de los de tipo 25 mini teclas. Y con un 'hard' cuidado en el que las teclas son decentes, cosa que no siempre sucede. Hace muy bien lo que hace y lo que hace es mucho. Para conseguir más, hay que ir a más espacio y a más presupuesto."  
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

// agregar noticias
agregarNoticias();

let carrito = [];
let total = 0; // Variable para el total del carrito

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
      <button onclick="agregarAlCarrito(${producto.id})">Añadir al carrito</button>
    `;
    listaProductos.appendChild(elemento);
  });
}

// función para agregar productos al carrito
function agregarAlCarrito(idProducto) {
  const producto = productos.find((p) => p.id === idProducto);
  carrito.push(producto);
  total += producto.precio; // Sumar el precio del producto al total
  mostrarCarrito();
}

// función para mostrar productos en el carrito y el total
function mostrarCarrito() {
  const listaCarrito = document.getElementById("lista-carrito");
  const totalCarrito = document.getElementById("total-carrito"); // Asegúrate de tener un elemento para el total
  listaCarrito.innerHTML = ""; // Limpiar la lista del carrito
  carrito.forEach((producto, index) => {
    const elemento = document.createElement("li");
    elemento.innerHTML = `
      <img src="${producto.imagen}" alt="${producto.nombre}" style="width: 50px;">
      <span>${producto.nombre} - ${producto.precio}€</span>
      <button onclick="eliminarDelCarrito(${index})">Eliminar</button>
    `;
    listaCarrito.appendChild(elemento);
  });
  totalCarrito.innerText = `Total: ${total}€`; // Actualizar el total
}

// función para eliminar productos del carrito
function eliminarDelCarrito(indice) {
  const productoEliminado = carrito[indice];
  carrito.splice(indice, 1); // Eliminar del carrito
  total -= productoEliminado.precio; // Restar el precio del producto eliminado
  mostrarCarrito(); // Actualizar la lista del carrito
}

// agregar productos a la lista
agregarProductos();
