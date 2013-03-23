package com.commafeed.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;

@Entity
@Table(name = "FEEDCATEGORIES")
@SuppressWarnings("serial")
public class FeedCategory extends AbstractModel {

	@Column(length = 128)
	private String name;

	@ManyToOne
	private User user;

	@ManyToOne
	private FeedCategory parent;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Set<FeedSubscription> subscriptions = Sets.newHashSet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FeedCategory getParent() {
		return parent;
	}

	public void setParent(FeedCategory parent) {
		this.parent = parent;
	}

	public Set<FeedSubscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Set<FeedSubscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

}
