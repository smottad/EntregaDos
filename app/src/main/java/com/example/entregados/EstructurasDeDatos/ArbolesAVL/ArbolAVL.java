package com.example.entregados.EstructurasDeDatos.ArbolesAVL;

public class ArbolAVL {
    private NodoArbolAVL raiz;
    public ArbolAVL() {
        raiz = null;
    }

    //Buscar
    public NodoArbolAVL buscar(long dato, NodoArbolAVL r) {
        if(r == null) return null;

        if(r.dato == dato) {
            return r;
        }else if(r.dato < dato) {
            return buscar(dato, r.hijoDcho);
        }else {
            return buscar(dato, r.hijoIzdo);
        }
    }

    //Factor Equilibrio
    public int obtenerFE(NodoArbolAVL x) {
        if(x == null) {
            return -1;
        }else {
            return x.fe;
        }
    }

    //Rotacion simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoIzdo;
        c.hijoIzdo = auxiliar.hijoDcho;
        auxiliar.hijoDcho = c;
        c.fe = Math.max(obtenerFE(c.hijoIzdo), obtenerFE(c.hijoDcho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzdo), obtenerFE(auxiliar.hijoDcho)) + 1;
        return auxiliar;
    }

    //Rotacion simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoDcho;
        c.hijoDcho = auxiliar.hijoIzdo;
        auxiliar.hijoIzdo = c;
        c.fe = Math.max(obtenerFE(c.hijoIzdo), obtenerFE(c.hijoDcho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzdo), obtenerFE(auxiliar.hijoDcho)) + 1;
        return auxiliar;
    }

    //Rotacion Doble a la Derecha
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoIzdo =  rotacionDerecha(c.hijoIzdo);
        temporal = rotacionIzquierda(c);
        return temporal;
    }

    //Rotacion Doble a la Izquierda
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoDcho =  rotacionIzquierda(c.hijoDcho);
        temporal = rotacionDerecha(c);
        return temporal;
    }

    //Insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre=subAr;
        if(nuevo.dato<subAr.dato){
            if(subAr.hijoIzdo==null){
                subAr.hijoIzdo=nuevo;
            }else{
                subAr.hijoIzdo=insertarAVL(nuevo, subAr.hijoIzdo);
                if((obtenerFE(subAr.hijoIzdo)-obtenerFE(subAr.hijoDcho)==2)){
                    if(nuevo.dato<subAr.hijoIzdo.dato){
                        nuevoPadre=rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else if(nuevo.dato>subAr.dato){
            if(subAr.hijoDcho==null){
                subAr.hijoDcho=nuevo;
            }else{
                subAr.hijoDcho=insertarAVL(nuevo, subAr.hijoDcho);
                if((obtenerFE(subAr.hijoDcho)-obtenerFE(subAr.hijoIzdo)==2)){
                    if(nuevo.dato>subAr.hijoDcho.dato){
                        nuevoPadre=rotacionDerecha(subAr);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subAr);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }
        //Actualizar altura
        if((subAr.hijoIzdo==null)&&(subAr.hijoDcho!=null)){
            subAr.fe=subAr.hijoDcho.fe+1;
        }else if((subAr.hijoDcho==null)&&(subAr.hijoIzdo!=null)){
            subAr.fe=subAr.hijoIzdo.fe+1;
        }else{
            subAr.fe=Math.max(obtenerFE(subAr.hijoIzdo), obtenerFE(subAr.hijoDcho))+1;
        }
        return nuevoPadre;
    }

    //Insertar normal
    public void insertar(int d){
        NodoArbolAVL nuevo= new NodoArbolAVL(d);
        if(raiz==null){
            raiz=nuevo;
        }else{
            raiz=insertarAVL(nuevo, raiz);
        }
    }

    //RECORRIDOS
    //Recorrer In orden
    public void inOrden(NodoArbolAVL r){
        if(r!=null){
            inOrden(r.hijoIzdo);
            System.out.println(r.dato);
            inOrden(r.hijoDcho);
        }
    }
    //Recorrer en Preorden
    public void preorden(NodoArbolAVL r){
        if(r!=null){
            System.out.println(r.dato);
            preorden(r.hijoIzdo);
            preorden(r.hijoDcho);
        }
    }
    //Recorrer Postorden
    public void postOrden(NodoArbolAVL r){
        if(r!=null){
            postOrden(r.hijoIzdo);
            postOrden(r.hijoDcho);
            System.out.println(r.dato);
        }
    }
    public boolean estaVacio(){
        return raiz==null;
    }

    public NodoArbolAVL getRaiz(){
        return raiz;
    }

}
