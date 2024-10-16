/*
let carrito = [];

function mostrarCarrito() {
  const listaCarrito = document.getElementById("lista-carrito");
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

function agregarAlCarrito(idProducto) {
  const producto = productos.find((p) => p.id === idProducto);
  carrito.push(producto);
  mostrarCarrito();
}

function eliminarDelCarrito(indice) {
  carrito.splice(indice, 1);
  mostrarCarrito();
}

mostrarCarrito();
*/
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

