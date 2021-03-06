

/* First created by JCasGen Thu Aug 15 13:53:20 EDT 2013 */
package org.oaqa.dso.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** A query operator in the abstract search query model.
 * Updated by JCasGen Tue Aug 27 18:06:53 EDT 2013
 * XML source: /home/ruil/workspace/git/helloqa/src/main/resources/edu/cmu/lti/oaqa/OAQATypes.xml
 * @generated */
public class QueryOperator extends OAQATop {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QueryOperator.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected QueryOperator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QueryOperator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QueryOperator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets The name (kind) of the operator.
   * @generated */
  public String getName() {
    if (QueryOperator_Type.featOkTst && ((QueryOperator_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.oaqa.dso.model.QueryOperator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QueryOperator_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets The name (kind) of the operator. 
   * @generated */
  public void setName(String v) {
    if (QueryOperator_Type.featOkTst && ((QueryOperator_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.oaqa.dso.model.QueryOperator");
    jcasType.ll_cas.ll_setStringValue(addr, ((QueryOperator_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: args

  /** getter for args - gets The arguments for the operator.
   * @generated */
  public StringList getArgs() {
    if (QueryOperator_Type.featOkTst && ((QueryOperator_Type)jcasType).casFeat_args == null)
      jcasType.jcas.throwFeatMissing("args", "org.oaqa.dso.model.QueryOperator");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QueryOperator_Type)jcasType).casFeatCode_args)));}
    
  /** setter for args - sets The arguments for the operator. 
   * @generated */
  public void setArgs(StringList v) {
    if (QueryOperator_Type.featOkTst && ((QueryOperator_Type)jcasType).casFeat_args == null)
      jcasType.jcas.throwFeatMissing("args", "org.oaqa.dso.model.QueryOperator");
    jcasType.ll_cas.ll_setRefValue(addr, ((QueryOperator_Type)jcasType).casFeatCode_args, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    