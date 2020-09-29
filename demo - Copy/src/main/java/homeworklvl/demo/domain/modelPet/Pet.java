package homeworklvl.demo.domain.modelPet;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import homeworklvl.demo.domain.modelDiary.Diary;
import homeworklvl.demo.domain.modelUser.User;
import homeworklvl.demo.domain.petCost.PetCost;

@Entity
@Table(name = "pet")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "pet")
	private PetCost petCost;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private List<Diary> diarys;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "name")
	@NotNull
	private String petName;
	
	@Column(name = "type")
	@NotNull
	private PetType petType;
	
	@Column(name = "registrationDay")
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date petRegistrationDate;
	
	@Column(name = "unregistrationDay")
	private Date petUnregistrationDate;

	public Long getId() {
		return id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Date getPetRegistrationDate() {
		return petRegistrationDate;
	}

	public void setPetRegistrationDate(Date petRegistrationDate) {
		this.petRegistrationDate = petRegistrationDate;
	}

	public Date getPetUnregistrationDate() {
		return petUnregistrationDate;
	}

	public void setPetUnregistrationDate(Date petUnregistrationDate) {
		this.petUnregistrationDate = petUnregistrationDate;
	}

	public List<Diary> getDiarys() {
		return diarys;
	}

	public void setDiarys(List<Diary> diarys) {
		this.diarys = diarys;
	}

	public PetCost getPetCost() {
		return petCost;
	}

	public void setPetCost(PetCost petCost) {
		this.petCost = petCost;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
	
}
