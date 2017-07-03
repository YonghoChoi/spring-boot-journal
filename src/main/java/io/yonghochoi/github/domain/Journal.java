package io.yonghochoi.github.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DB에 저장 가능한 JPA 엔티티이므로 @Entity, @Id, @GeneratedValue 애너테이션으로 표시
 */
@Getter
@Setter
@Entity
@ToString
public class Journal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private Date created;
    private String summary;

    @Transient  // @Transient를 붙이면 JPA 엔진이 이 값을 저장하지 않고 무시
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public Journal() {
    }

    public Journal(String title, String summary, String created) throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = format.parse(created);
    }

    public String getCreatedAsShort() {
        return format.format(created);
    }
}
