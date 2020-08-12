package com.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;import java.util.stream.Collector;
import java.util.stream.Collectors;

class Country{
	
	int id;
	String name;
	public Country(int cid,String cname) {
		this.id=cid;
		this.name=cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ID :"+this.id+"Name :"+this.name;
	}
	@Override
	public boolean equals(Object obj) {
		return this.name == ((Country) obj).getName();
	}
}
public class MatchedList {

	public static void main(String[] args) {
		List<Country> clist = new ArrayList<Country>();
		List<Country> slist = new ArrayList<Country>();
		clist.add(new Country(1,"barat"));
		clist.add(new Country(1,"usa"));
		clist.add(new Country(1,"bwiss"));
		clist.add(new Country(1,"aakistan"));
		
		slist.add(new Country(1,"usa"));
		slist.add(new Country(1,"barat"));
		
		//List<Country> nmlist = clist.stream().filter(c->slist.stream().noneMatch(s->s.getName().equals(c.getName()))).collect(Collectors.toList());
		//List<Country>  tlist= slist.stream().filter(clist::contatins).collect(Collectors.<Country>toList());
		//tlist.forEach(t->System.out.println(t));
		//clist.forEach(c->System.out.println(c));
		//clist.stream().sorted((obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		//System.out.println("--------");
		//List<Country> mlist = new ArrayList<Country>();
		/*
		 * for(Country sc :slist) { ListIterator<Country> lit = clist.listIterator();
		 * while(lit.hasNext()) { Country ac = lit.next();
		 * if(sc.getName().equals(ac.getName())) { mlist.add(ac); } } }
		 */
		//List<Country> mlist = slist.stream().forEach( s->{clist.stream().filter(c->{return c.getName().equals(s.getName());}).collect(Collectors.toList());});
		List<Country> mlist = clist.stream().filter(c->slist.stream().anyMatch(s->s.getName().equals(c.getName()))).collect(Collectors.toList());
		System.out.println("**Matched List**");
		mlist.forEach(ml->System.out.println(ml));
		System.out.println("**UnMatched List**");
		//clist.removeAll(slist);
		//clist.forEach(ml->System.out.println(ml));
		List<Country> nmlist = clist.stream().filter(c->slist.stream().noneMatch(s->s.getName().equals(c.getName()))).collect(Collectors.toList());
		nmlist.forEach(nml->System.out.println(nml));
		System.out.println("**Sorting Order for Unmatched List**"); 
		nmlist.sort((Country c1, Country c2)->c1.getName().compareTo(c2.getName()));
		nmlist.forEach(c->System.out.println(c));
		System.out.println("**FinalList**");
		mlist.addAll(nmlist);
		mlist.forEach(a->System.out.println(a));
	}

}
