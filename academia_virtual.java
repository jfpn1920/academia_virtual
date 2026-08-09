import java.util.Scanner;
public class academia_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = new String[10];
        int[] edades = new int[10];
        String[] generos = new String[10];
        String[] fechasNacimiento = new String[10];
        String[] correos = new String[10];
        String[] cursos = new String[10];
        String[] instructores = new String[10];
        int[] duraciones = new int[10];
        int[] progreso = new int[10];
        int total = 0;
        int opcion;
        //----------------------------------------//
        //--|menu_principal_de_academia_virtual|--//
        //----------------------------------------//
        do {
            System.out.println("menu principal de academia virtual");
            System.out.println("1) Registrar estudiante");
            System.out.println("2) Editar estudiante");
            System.out.println("3) Listar estudiantes");
            System.out.println("4) Eliminar estudiante");
            System.out.println("5) Buscar estudiante");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|Registrar_estudiante|--//
                //--------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del estudiante");
                    System.out.println("id del estudiante a registrar: " + id);
                    System.out.print("nombre del estudiante: ");
                    estudiantes[total] = entrada.nextLine();
                    System.out.print("edad del estudiante: ");
                    edades[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("genero del estudiante: ");
                    generos[total] = entrada.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    fechasNacimiento[total] = entrada.nextLine();
                    System.out.print("Correo electronico: ");
                    correos[total] = entrada.nextLine();
                    System.out.print("Nombre del curso: ");
                    cursos[total] = entrada.nextLine();
                    System.out.print("Instructor: ");
                    instructores[total] = entrada.nextLine();
                    System.out.print("Duracion en horas: ");
                    duraciones[total] = entrada.nextInt();
                    entrada.nextLine();
                    progreso[total] = 0;
                    System.out.println("Estudiante registrado correctamente.");
                    total++;
                    break;
                //-------------------------//
                //--|actualizar_progreso|--//
                //-------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen estudiantes registrados.");
                        break;
                    }
                    System.out.println("Datos de los estudiantes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + estudiantes[i] + " | Edad: " + edades[i] + " | Genero: " + generos[i] + " | Fecha de nacimiento: " + fechasNacimiento[i] + " | Correo: " + correos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Duracion: " + duraciones[i] + " horas | Progreso: " + progreso[i] + "%");
                    }
                    System.out.print("Ingrese el ID del estudiante: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del estudiante");
                        System.out.print("Nuevo nombre: ");
                        estudiantes[posicion] = entrada.nextLine();
                        System.out.print("Nueva edad: ");
                        edades[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo genero: ");
                        generos[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de nacimiento: ");
                        fechasNacimiento[posicion] = entrada.nextLine();
                        System.out.print("Nuevo correo electronico: ");
                        correos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del curso: ");
                        cursos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo instructor: ");
                        instructores[posicion] = entrada.nextLine();
                        System.out.print("Nueva duracion en horas: ");
                        duraciones[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo progreso (0-100): ");
                        int nuevoProgreso = entrada.nextInt();
                        entrada.nextLine();
                        if (nuevoProgreso >= 0 && nuevoProgreso <= 100) {
                            progreso[posicion] = nuevoProgreso;
                            System.out.println("Estudiante actualizado correctamente.");
                        } else {
                            System.out.println("El progreso debe estar entre 0 y 100.");
                        }
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_estudiantes|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen estudiantes registrados.");
                    } else {
                        System.out.println("listar estudiantes");
                        for (int i = 0; i < total; i++) {
                            String estado;
                            if (progreso[i] >= 100) {
                                estado = "Completado";
                            } else if (progreso[i] > 0) {
                                estado = "En progreso";
                            } else {
                                estado = "Inscrito";
                            }
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + estudiantes[i] + " | Edad: " + edades[i] + " | Genero: " + generos[i] + " | Fecha de nacimiento: " + fechasNacimiento[i] + " | Correo: " + correos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Duracion: " + duraciones[i] + " horas | Progreso: " + progreso[i] + "% | Estado: " + estado);
                        }
                    }
                    break;
                //-------------------------//
                //--|eliminar_estudiante|--//
                //-------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen estudiantes registrados.");
                        break;
                    }
                    System.out.println("ESTUDIANTES REGISTRADOS");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + estudiantes[i] + " | Edad: " + edades[i] + " | Genero: " + generos[i] + " | Fecha de nacimiento: " + fechasNacimiento[i] + " | Correo: " + correos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Duracion: " + duraciones[i] + " horas | Progreso: " + progreso[i] + "%");
                    }
                    System.out.print("Ingrese el ID del estudiante que desea eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        System.out.println("Registro seleccionado");
                        System.out.println("ID: " + idEliminar + " | Nombre: " + estudiantes[posicion] + " | Curso: " + cursos[posicion] + " | Progreso: " + progreso[posicion] + "%");
                        System.out.print("¿Desea eliminar este estudiante? (s/n): ");
                        String confirmacion = entrada.nextLine();
                        if (confirmacion.equalsIgnoreCase("s")) {
                            for (int i = posicion; i < total - 1; i++) {
                                estudiantes[i] = estudiantes[i + 1];
                                edades[i] = edades[i + 1];
                                generos[i] = generos[i + 1];
                                fechasNacimiento[i] = fechasNacimiento[i + 1];
                                correos[i] = correos[i + 1];
                                cursos[i] = cursos[i + 1];
                                instructores[i] = instructores[i + 1];
                                duraciones[i] = duraciones[i + 1];
                                progreso[i] = progreso[i + 1];
                            }
                            total--;
                            System.out.println("Estudiante eliminado correctamente.");
                        } else {
                            System.out.println("Eliminacion cancelada.");
                        }
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|buscar_estudiante|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen estudiantes registrados.");
                        break;
                    }
                    System.out.println("busqueda de estudiante");
                    System.out.print("ingresa la id para buscar estudiante: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del estudiante encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + estudiantes[posicion] + " | Edad: " + edades[posicion] + " | Genero: " + generos[posicion] + " | Fecha de nacimiento: " + fechasNacimiento[posicion] + " | Correo: " + correos[posicion] + " | Curso: " + cursos[posicion] + " | Instructor: " + instructores[posicion] + " | Duracion: " + duraciones[posicion] + " horas | Progreso: " + progreso[posicion] + "%");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Academia Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}