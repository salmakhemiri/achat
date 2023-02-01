package Services;

import Entity.Role;
import Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceIMP extends GenericServiceIMP<Role,Integer> implements RoleService{
    @Autowired
    RoleRepository roleRepository;
}
