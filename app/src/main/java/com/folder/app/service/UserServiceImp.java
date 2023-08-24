package com.folder.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folder.app.dao.UserDao;
import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
@Service
public class UserServiceImp implements UserService {

    private ResultDTO rDto;

    @Autowired UserDao uDao;  
    
    @Override
    public ResultDTO findAll(){
        rDto = new ResultDTO();
        List<UserDTO> resultList = uDao.findAll();
        if(resultList != null)
        {
            rDto.setState(true);
            rDto.setResult(resultList);
        }
        else{
            rDto.setState(false);            
        }
        return rDto;
    }

    @Override
    public ResultDTO editById(UserDTO uDto){
        rDto = new ResultDTO();
        int state = uDao.editById(uDto);
        System.out.println(state);
        if(state == 1){
            rDto.setState(true);
            rDto.setMessage("수정이 완료되었습니다");
        }else{
            rDto.setState(false);
            rDto.setMessage("수정에 실패하였습니다");

        }
        return rDto;
    }

    @Override
    public ResultDTO delete(int no){
        rDto = new ResultDTO();
        int state = uDao.delete(no);
        System.out.println(state);
        if(state == 1){
            rDto.setState(true);
            rDto.setMessage("삭제가 완료되었습니다");
        }else{
            rDto.setState(false);
            rDto.setMessage("삭제에 실패하였습니다");

        }
        return rDto;
    }

    @Override
    public ResultDTO save(UserDTO uDto){
        rDto = new ResultDTO();
        int state = uDao.save(uDto);
        System.out.println(state);
        if(state == 1){
            rDto.setState(true);
            rDto.setMessage("생성이 완료되었습니다");
        }else{
            rDto.setState(false);
            rDto.setMessage("생성에 실패하였습니다");

        }
        return rDto;
    }
}
