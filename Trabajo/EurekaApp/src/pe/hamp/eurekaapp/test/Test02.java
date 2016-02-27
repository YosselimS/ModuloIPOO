
package pe.hamp.eurekaapp.test;

import pe.hamp.eurekaapp.dao.espec.EmpleadoDaoCrud;
import pe.hamp.eurekaapp.dao.impl.EmpleadoDaoImpl;
import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author Upao
 */
public class Test02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        EmpleadoBean bean=new EmpleadoBean();                
        bean.setPaterno("A");
        bean.setMaterno("B");
        bean.setNombre("C");
        bean.setCiudad("C");
        bean.setDireccion("F");
        bean.setUsuario("G");
        bean.setClave("H");
        
        EmpleadoDaoCrud clienteDao=new EmpleadoDaoImpl();
        //clienteDao.insertar(bean);
        
        System.out.println("Todo ok. codigo:"+bean.getCodigo());
        
        bean=clienteDao.traerPorCodigo("9999");
        if(bean==null)
            System.out.println("No existe");
        else
            System.out.println("Hola:"+bean.getNombre());
        
    }
    
}
