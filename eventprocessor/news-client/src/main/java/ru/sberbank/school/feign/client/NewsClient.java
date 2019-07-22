package ru.sberbank.school.feign.client;

import lombok.NonNull;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sberbank.school.feign.model.NewsModel;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@FeignClient(name = "news-service")
public interface NewsClient {

	@RequestMapping(method = GET, value = "/news/{id}", produces = APPLICATION_JSON_UTF8_VALUE)
	NewsModel getNews(@NonNull @PathVariable("Id") long id);

	@RequestMapping(method = POST, value = "/news")
	void createNews(@NonNull NewsModel news);

	@RequestMapping(method = PUT, value = "/news")
	void updateNews(@NonNull NewsModel news);//TODO не уверен что он нужен

	@RequestMapping(method = DELETE, value = "/news/{id}")
	void deleteNews(@NonNull @PathVariable("Id") long id);
}
