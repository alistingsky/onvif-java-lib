package org.onvif.ver10.doorcontrol.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", name = "DoorControlPort")
@XmlSeeAlso({ObjectFactory.class, org.onvif.ver10.pacs.ObjectFactory.class})
public interface DoorControlPort {

    /**
     * This operation allows momentarily accessing a Door.
     * It invokes the functionality typically used when a card holder presents a
     * card to a card reader at the door and is granted access.
     * </p><p>
     * The DoorMode shall change to Accessed state. Please refer to Accessed mode in section
     * [DoorMode] for more details.
     * </p><p>
     * The Door shall remain accessible for the defined time. When the time span
     * elapses, the DoorMode shall change back to its previous state.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * </p><p>
     * Please refer to section [DoorMode] for details about Door Modes restrictions.
     * </p><p>
     * A device that signals support for Access capability for a particular Door
     * instance shall implement this method. A device that signals support for
     * AccessTimingOverride capability for a particular Door instance shall also
     * provide optional timing parameters (AccessTime, OpenTooLongTime and
     * PreAlarmTime) when performing AccessDoor command.
     * </p><p>
     * The device shall take the best effort approach for parameters not supported,
     * it must fallback to preconfigured time or limit the time to the closest
     * supported time if the specified time is out of range.
     *       
     */
    @WebMethod(operationName = "AccessDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/AccessDoor")
    @RequestWrapper(localName = "AccessDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.AccessDoor")
    @ResponseWrapper(localName = "AccessDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.AccessDoorResponse")
    public void accessDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token,
        @WebParam(name = "UseExtendedTime", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.Boolean useExtendedTime,
        @WebParam(name = "AccessTime", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        javax.xml.datatype.Duration accessTime,
        @WebParam(name = "OpenTooLongTime", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        javax.xml.datatype.Duration openTooLongTime,
        @WebParam(name = "PreAlarmTime", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        javax.xml.datatype.Duration preAlarmTime,
        @WebParam(name = "Extension", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        org.onvif.ver10.doorcontrol.wsdl.AccessDoorExtension extension
    );

    /**
     * This operation allows unlocking a Door.
     * The DoorMode shall change to Unlocked state.
     * Please refer to Unlocked mode in section [DoorMode] for more details.
     * </p><p>
     * A device that signals support for Unlock capability for a particular Door
     * instance shall implement this method.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * Please refer to section [DoorMode] for more details about Door Modes restrictions.
     *       
     */
    @WebMethod(operationName = "UnlockDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/UnlockDoor")
    @RequestWrapper(localName = "UnlockDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.UnlockDoor")
    @ResponseWrapper(localName = "UnlockDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.UnlockDoorResponse")
    public void unlockDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows releasing the LockedDown state of a Door.
     * The DoorMode shall change back to its previous/next state.
     * It is not defined what the previous/next state shall be, but typically - Locked.
     * </p><p>
     * This method shall only succeed if the current DoorMode is LockedDown.
     *       
     */
    @WebMethod(operationName = "LockDownReleaseDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/LockDownReleaseDoor")
    @RequestWrapper(localName = "LockDownReleaseDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDownReleaseDoor")
    @ResponseWrapper(localName = "LockDownReleaseDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDownReleaseDoorResponse")
    public void lockDownReleaseDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation requests a list of all DoorInfo items provided by the device.
     * An ONVIF compliant device that provides Door Control service shall implement
     * this method.
     * </p><p>
     * 
     * A call to this method shall return a StartReference when not all data is returned and more
     * data is available.
     * The reference shall be valid for retrieving the next set of data.
     * Please refer section 4.8.3 of Access Control Service Specification for more details.
     * The number of items returned shall not be greater than Limit parameter.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "GetDoorInfoList", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/GetDoorInfoList")
    @RequestWrapper(localName = "GetDoorInfoList", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorInfoList")
    @ResponseWrapper(localName = "GetDoorInfoListResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorInfoListResponse")
    public void getDoorInfoList(

        @WebParam(name = "Limit", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.Integer limit,
        @WebParam(name = "StartReference", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String startReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "NextStartReference", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        javax.xml.ws.Holder<java.lang.String> nextStartReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "DoorInfo", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        javax.xml.ws.Holder<java.util.List<org.onvif.ver10.doorcontrol.wsdl.DoorInfo>> doorInfo
    );

    /**
     * This operation allows unlocking a Door and preventing other actions until LockOpenRelease
     * method is invoked.
     * The DoorMode shall change to LockedOpen state.
     * Please refer to LockedOpen mode in section [DoorMode] for more details.
     * </p><p>
     * The device shall ignore other door control commands until a LockOpenRelease command is
     * performed.
     * </p><p>
     * A device that signals support for LockOpen capability for a particular Door instance shall
     * implement this method.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * Please refer to section [DoorMode] for more details about Door Modes restrictions.
     *       
     */
    @WebMethod(operationName = "LockOpenDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/LockOpenDoor")
    @RequestWrapper(localName = "LockOpenDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockOpenDoor")
    @ResponseWrapper(localName = "LockOpenDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockOpenDoorResponse")
    public void lockOpenDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation is used for securely locking a Door.
     * A call to this method shall change DoorMode state to DoubleLocked.
     * Please refer to DoubleLocked mode in section [DoorMode] for more details.
     * </p><p>
     * A device that signals support for DoubleLock capability for a particular
     * Door instance shall implement this method. Otherwise this method can be
     * performed as a standard Lock operation (see [LockDoor command]).
     * </p><p>
     * If the door has an extra lock that shall be locked as well.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     *       
     */
    @WebMethod(operationName = "DoubleLockDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/DoubleLockDoor")
    @RequestWrapper(localName = "DoubleLockDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.DoubleLockDoor")
    @ResponseWrapper(localName = "DoubleLockDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.DoubleLockDoorResponse")
    public void doubleLockDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows locking a Door.
     * The DoorMode shall change to Locked state.
     * Please refer to Locked mode in section [DoorMode] for more details.
     * </p><p>
     * A device that signals support for Lock capability for a particular Door
     * instance shall implement this method.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * Please refer to section [DoorMode] for more details about Door Modes restrictions.
     *       
     */
    @WebMethod(operationName = "LockDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/LockDoor")
    @RequestWrapper(localName = "LockDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDoor")
    @ResponseWrapper(localName = "LockDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDoorResponse")
    public void lockDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows releasing the LockedOpen state of a Door.
     * The DoorMode shall change state from the LockedOpen state back to its previous/next state.
     * It is not defined what the previous/next state shall be, but typically - Unlocked.
     * </p><p>
     * This method shall only succeed if the current DoorMode is LockedOpen.
     *       
     */
    @WebMethod(operationName = "LockOpenReleaseDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/LockOpenReleaseDoor")
    @RequestWrapper(localName = "LockOpenReleaseDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockOpenReleaseDoor")
    @ResponseWrapper(localName = "LockOpenReleaseDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockOpenReleaseDoorResponse")
    public void lockOpenReleaseDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation requests a list of DoorInfo items matching the given tokens.
     * An ONVIF-compliant device that provides Door Control service shall implement this method.
     * </p><p>
     * 
     * The device shall ignore tokens it cannot resolve and may return an empty list
     * if there are no items matching specified tokens.
     * If the number of requested items is greater than MaxLimit, a TooManyItems fault shall be
     * returned.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "GetDoorInfo", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/GetDoorInfo")
    @RequestWrapper(localName = "GetDoorInfo", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorInfo")
    @ResponseWrapper(localName = "GetDoorInfoResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorInfoResponse")
    @WebResult(name = "DoorInfo", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
    public java.util.List<org.onvif.ver10.doorcontrol.wsdl.DoorInfo> getDoorInfo(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.util.List<java.lang.String> token
    );

    /**
     * This operation returns the capabilities of the service.
     * </p><p>
     * An ONVIF compliant device which provides the Door Control service shall implement this
     * method.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
    public org.onvif.ver10.doorcontrol.wsdl.ServiceCapabilities getServiceCapabilities()
;

    /**
     * This operation allows locking and preventing other actions until a LockDownRelease command
     * is invoked.
     * The DoorMode shall change to LockedDown state.
     * Please refer to LockedDown mode in section [DoorMode] for more details.
     * </p><p>
     * The device shall ignore other door control commands until a LockDownRelease command is
     * performed.
     * </p><p>
     * A device that signals support for LockDown capability for a particular Door
     * instance shall implement this method.
     * </p><p>
     * If a device supports DoubleLock capability for a particular Door instance,
     * that operation may be engaged as well.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * Please refer to section [DoorMode] for more details about Door Modes restrictions.
     *       
     */
    @WebMethod(operationName = "LockDownDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/LockDownDoor")
    @RequestWrapper(localName = "LockDownDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDownDoor")
    @ResponseWrapper(localName = "LockDownDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.LockDownDoorResponse")
    public void lockDownDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows blocking a Door and preventing momentary access (AccessDoor command).
     * The DoorMode shall change to Blocked state.
     * Please refer to Blocked mode in section [DoorMode] for more details.
     * </p><p>
     * A device that signals support for Block capability for a particular Door
     * instance shall implement this method.
     * </p><p>
     * If the request cannot be fulfilled, a Failure fault shall be returned.
     * Please refer to section [DoorMode] for more details about Door Modes restrictions.
     *       
     */
    @WebMethod(operationName = "BlockDoor", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/BlockDoor")
    @RequestWrapper(localName = "BlockDoor", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.BlockDoor")
    @ResponseWrapper(localName = "BlockDoorResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.BlockDoorResponse")
    public void blockDoor(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation requests the state of a Door specified by the Token.
     * </p><p>
     * A device implementing the Door Control service shall be capable of reporting
     * the status of a door using a DoorState structure available from the
     * GetDoorState command.
     *       
     */
    @WebMethod(operationName = "GetDoorState", action = "http://www.onvif.org/ver10/doorcontrol/wsdl/GetDoorState")
    @RequestWrapper(localName = "GetDoorState", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorState")
    @ResponseWrapper(localName = "GetDoorStateResponse", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl", className = "org.onvif.ver10.doorcontrol.wsdl.GetDoorStateResponse")
    @WebResult(name = "DoorState", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
    public org.onvif.ver10.doorcontrol.wsdl.DoorState getDoorState(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
        java.lang.String token
    );
}