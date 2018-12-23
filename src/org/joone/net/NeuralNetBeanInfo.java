/*
 * NeuralNetBeanInfo.java
 *
 * Created on 28 aprile 2004, 22.51
 */

package org.joone.net;

import java.beans.*;

/**
 * @author paolo
 */
public class NeuralNetBeanInfo extends SimpleBeanInfo {
    
    // Bean descriptor //GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( NeuralNet.class , null );//GEN-HEADEREND:BeanDescriptor
        
        // Here you can add code for customizing the BeanDescriptor.
        
        return beanDescriptor;         }//GEN-LAST:BeanDescriptor
    
    
    // Property identifiers //GEN-FIRST:Properties
    private static final int PROPERTY_descriptor = 0;
    private static final int PROPERTY_inputLayer = 1;
    private static final int PROPERTY_layerName = 2;
    private static final int PROPERTY_layers = 3;
    private static final int PROPERTY_macroPlugin = 4;
    private static final int PROPERTY_monitor = 5;
    private static final int PROPERTY_outputLayer = 6;
    private static final int PROPERTY_scriptingEnabled = 7;
    private static final int PROPERTY_teacher = 8;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[9];
    
        try {
            properties[PROPERTY_descriptor] = new PropertyDescriptor ( "descriptor", NeuralNet.class, "getDescriptor", "setDescriptor" );
            properties[PROPERTY_inputLayer] = new PropertyDescriptor ( "inputLayer", NeuralNet.class, "getInputLayer", "setInputLayer" );
            properties[PROPERTY_layerName] = new PropertyDescriptor ( "layerName", NeuralNet.class, "getLayerName", "setLayerName" );
            properties[PROPERTY_layers] = new PropertyDescriptor ( "layers", NeuralNet.class, "getLayers", "setLayers" );
            properties[PROPERTY_macroPlugin] = new PropertyDescriptor ( "macroPlugin", NeuralNet.class, "getMacroPlugin", "setMacroPlugin" );
            properties[PROPERTY_monitor] = new PropertyDescriptor ( "monitor", NeuralNet.class, "getMonitor", "setMonitor" );
            properties[PROPERTY_monitor].setExpert ( true );
            properties[PROPERTY_outputLayer] = new PropertyDescriptor ( "outputLayer", NeuralNet.class, "getOutputLayer", "setOutputLayer" );
            properties[PROPERTY_scriptingEnabled] = new PropertyDescriptor ( "scriptingEnabled", NeuralNet.class, "isScriptingEnabled", "setScriptingEnabled" );
            properties[PROPERTY_teacher] = new PropertyDescriptor ( "teacher", NeuralNet.class, "getTeacher", "setTeacher" );
        }
        catch( IntrospectionException e) {}//GEN-HEADEREND:Properties
        
        // Here you can add code for customizing the properties array.
        
        return properties;         }//GEN-LAST:Properties
    
    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        
        // Here you can add code for customizing the event sets array.
        
        return eventSets;         }//GEN-LAST:Events
    
    // Method identifiers //GEN-FIRST:Methods

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[0];//GEN-HEADEREND:Methods
        
        // Here you can add code for customizing the methods array.
        
        return methods;         }//GEN-LAST:Methods
    
    
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx
    
    
 //GEN-FIRST:Superclass
    
    // Here you can add code for customizing the Superclass BeanInfo.
    
 //GEN-LAST:Superclass
    
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }
    
    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }
    
    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return  An array of EventSetDescriptors describing the kinds of
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }
    
    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return  An array of MethodDescriptors describing the methods
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }
    
    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }
    
    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean.
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }
}

