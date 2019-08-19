package com.amdocs;
import java.util.*;
public class PaperWala implements Iobservable {
	private ArrayList<Iobserver> subscribers;
	public PaperWala() {
		subscribers =new ArrayList<Iobserver>();
	}
	
	public void addSubsriber(Iobserver observer) {
		// TODO Auto-generated method stub
		subscribers.add(observer);
	}

	public void removeSubsriber(Iobservable observer) {
		// TODO Auto-generated method stub
		subscribers.remove(observer);
	}

	public void NotifyAllSubsribers(Iobservable observer) {
		// TODO Auto-generated method stub
		for (Iobsrever customer: Iobserver)

	}

}
