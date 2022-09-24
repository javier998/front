import { Persona } from "./persona"

export class Usuario {
    usuario_id: Text| undefined
    password: Text|undefined
    persona : Persona = new Persona()
}
