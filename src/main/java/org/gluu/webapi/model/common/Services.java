package org.gluu.webapi.model.common;

public enum Services {
	
	PersistenceService("PersistenceService"),
	LdapService("LdapService");

    private final String serviceid;

    private Services(String serviceid) {

        this.serviceid = serviceid;
    }

    public String getServiceId() {

        return this.serviceid;
    }

}
