/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containerPackage;

/**
 *
 * @author carlo
 */
public class ContainerOfObjects {
    private final int DEFAULT_SIZE = 100;
    private Object objects[];

    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }
    
    public ContainerOfObjects(){
        this.objects = new Object[DEFAULT_SIZE];
    }
    
    public ContainerOfObjects(int maxSize){
        this.objects = new Object[maxSize];
    }
    
    protected boolean addObject (Object newObject){
        for (Object object : objects) {
            if (object == null) {
                object = newObject;
                return true;
            }
        }
        return false;
    }
    
    
/**
     * Método responsável por remover um {@link Object objeto} do vetor de 
     * {@link ContainerOfObjects#objects}
     * 
     * @param position indice correspondente ao objecto a eliminar
     * 
     * @return o {@link Object objeto} eliminado
     */
    protected Object removeObject(int position){
        Object o = objects[position];
        int i;
        for(i = position;i<this.objects.length-1 && objects[i] !=null;i++){
            objects[i] = objects[i+1];
        }
        objects[i]=null;
       return o;
    }
    
    
    protected boolean setObject(int position, Object newObject){
        objects[position] = newObject;
        return objects[position] == newObject; 
    }
    
    
    protected int findObject(Object obj){
        for(int i=0; i<objects.length; i++){
            if(objects[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
}
