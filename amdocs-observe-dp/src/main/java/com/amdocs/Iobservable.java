package com.amdocs;

public interface Iobservable {
		public void addSubsriber( Iobserver observer) ;
		public void removeSubsriber( Iobservable observer) 	;
		public void NotifyAllSubsribers( Iobservable observer) ;
}
