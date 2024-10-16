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