package cn.cnic.repository.system;

import cn.cnic.component.system.model.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

public interface SysRoleJpaRepository extends JpaRepository<SysRole, String>, JpaSpecificationExecutor<SysRole>, Serializable {

    @Query(value = "select Max(id) from SysRole ")
    long getMaxId();

}