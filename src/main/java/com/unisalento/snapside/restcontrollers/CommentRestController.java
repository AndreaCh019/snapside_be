package com.unisalento.snapside.restcontrollers;

import com.unisalento.snapside.adapters.CommentAdapter;
import com.unisalento.snapside.exceptions.CommentNotFoundException;
import com.unisalento.snapside.generated.domain.CommentEntity;
import com.unisalento.snapside.iservices.ICommentService;
import com.unisalento.snapside.models.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController()
@RequestMapping(value="/comment")
public class CommentRestController {
    @Autowired
    ICommentService commentService;

    public CommentRestController() { super(); }

    public CommentRestController(ICommentService commentService) { this.commentService = commentService; }

    @RequestMapping(value="/getAll", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<CommentDTO> getAll() throws CommentNotFoundException {
        List<CommentDTO> dtos = new ArrayList<CommentDTO>();
        List<CommentEntity> entities = commentService.getAll();
        Iterator<CommentEntity> iteratorElement = entities.iterator();
        while(iteratorElement.hasNext()){
            CommentEntity comment = iteratorElement.next();
            CommentDTO commentDTO = new CommentDTO();
            commentDTO= CommentAdapter.CommentEntityToCommentDTO(comment);
            dtos.add(commentDTO);
        }
        return dtos;
    }

    @GetMapping(value="/getById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public CommentDTO getById(@PathVariable("id") int id) throws CommentNotFoundException{
        CommentDTO commentDTO = new CommentDTO();
        CommentEntity comment = new CommentEntity();
        comment = commentService.getById(id);
        commentDTO=CommentAdapter.CommentEntityToCommentDTO(comment);
        return commentDTO;
    }

}

