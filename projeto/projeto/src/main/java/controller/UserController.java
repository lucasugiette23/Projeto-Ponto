package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor_ =  {@Autowired})
@RequestMapping("user-controller")
@CrossOrigin("*")
public class UserController {

//    @ApiOperation(value = "Cadastro de usuário")
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "Usuário cadastrado"),
//            @ApiResponse(code = 409, message = "Usuário já cadastrado"),
//    })
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserDTO userDTO) {
//        var user = this.userService.insert(UserDTOBuilder.toEntity(userDTO));
//        return ResponseEntity.status(HttpStatus.CREATED).body(UserDTOBuilder.fromEntity(user));
//    }
}
