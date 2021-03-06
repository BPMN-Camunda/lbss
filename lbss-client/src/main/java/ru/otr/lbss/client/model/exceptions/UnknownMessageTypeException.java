
package ru.otr.lbss.client.model.exceptions;

import javax.xml.ws.WebFault;

import ru.otr.lbss.client.model.types.basic.Void;

/**
 * 
 * a) Указан тип сообщения, либо не зарегистрированный в СМЭВ. b) Текущий клиент
 * не является зарегистрированным поставщиком сведений по запрошенному типу
 * сообщения.
 * 
 * 
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownMessageType", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class UnknownMessageTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6114366784640342142L;
	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private Void faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public UnknownMessageTypeException(String message, Void faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public UnknownMessageTypeException(String message, Void faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         ru.it.smev.message_exchange.autogenerated.types.basic.v1_1.Void
	 */
	public Void getFaultInfo() {
		return faultInfo;
	}

}
