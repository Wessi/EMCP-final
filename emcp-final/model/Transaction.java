package net.mofed.reportracking.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaction extends Auditable<String>{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	    private String docname;
		private String doctype;
		private String reportstatus;
		
		
		@JsonIgnore
		@ManyToOne
		private User user;
		
		@ManyToOne
		@JoinColumn(name="transactiondocumentid",insertable=false,updatable=false)
		private Document transactiondocument;
		private  String transactiondocumentid;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDocname() {
			return docname;
		}
		public void setDocname(String docname) {
			this.docname = docname;
		}
		public String getDoctype() {
			return doctype;
		}
		public void setDoctype(String doctype) {
			this.doctype = doctype;
		}
		public String getReportstatus() {
			return reportstatus;
		}
		public void setReportstatus(String reportstatus) {
			this.reportstatus = reportstatus;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Document getTransactiondocument() {
			return transactiondocument;
		}
		public void setTransactiondocument(Document transactiondocument) {
			this.transactiondocument = transactiondocument;
		}
		public String getTransactiondocumentid() {
			return transactiondocumentid;
		}
		public void setTransactiondocumentid(String transactiondocumentid) {
			this.transactiondocumentid = transactiondocumentid;
		}
		@Override
		public String toString() {
			return "Transaction [id=" + id + ", docname=" + docname + ", doctype=" + doctype + ", reportstatus="
					+ reportstatus + ", user=" + user + ", transactiondocument=" + transactiondocument
					+ ", transactiondocumentid=" + transactiondocumentid + "]";
		}
		public Transaction(Integer id, String docname, String doctype, String reportstatus) {
			super();
			this.id = id;
			this.docname = docname;
			this.doctype = doctype;
			this.reportstatus = reportstatus;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return this.id==((Transaction)obj).getId();
	  	} 
		
		
		
}
