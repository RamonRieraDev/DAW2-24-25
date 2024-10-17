// Saludo
console.log("Hola, Mundo!")

// Variables

// let se puede inicializar sin valor (undefined)
let cliente = 'Alfonso'
// const se debe inicializar con valor
const cliente1 = 'David'
// ver tipo de variable
console.log(typeof cliente)

// Objetos
// crear objeto
const alumno = {
    edad: 24,
    nombre: 'Pepe',
    cursando: true,
    
}

// ver atributo del objeto
console.log(alumno.edad)
console.table(alumno)

// destructuración
// crear objeto modo abreviado
const { edad, nombre, cursando } = alumno

// mejora literal
const autenticado = true
const alumno1 = 'Luis'
const nuevoAlumno = {
    autenticado,
    alumno1
}
console.log(nuevoAlumno)

//Object.freeze(alumno) // no se puede modificar
//Object.seal(alumno) // no permite añadir ni eliminar variables

alumno.cursando = false;
console.log(alumno)
alumno.foto = 'foto2.jpg'
console.log(alumno)

// Destructura de dos variables o más objetos

// Renombrar variables si tenemos nombres iguales
const profesor = {

    nombre : 'Ana',
    activo : false,
    asignatura : {
        asignatura : 'Sistemas Informáticos' 
}
}

const { nombre: nombreProfesor, asignatura : { asignatura_clase}} = profesor
console.log(nombreProfesor)
console.log(asignatura_clase)

