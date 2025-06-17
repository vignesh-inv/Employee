import React ,{useEffect, useState}from 'react'
import { listEmployees } from '../services/EmployeeServie'
const ListEmployee = () => {

    const[Employee,setEmployees]=useState([])
    useEffect(
        ()=> {
            listEmployees().then((Response)=>{
                setEmployees(Response.data);
            }).catch(error=>{
                console.error(error);
            }
            );
        },[]
    )
   

  return (
    
    <div className='container'>
        <h2>List of Employee</h2>
        <table className='table table-striped table'>
            <thead>
                <tr>
                    <th>Employee id</th>
                    <th>Employee first name</th>
                    <th>Employee role</th>
                    <th>Employee salary</th>
                </tr>
            </thead>
            <tbody>
                {
                    Employee.map(employee =>
                        <tr keys={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.name}</td>
                            <td>{employee.role}</td>
                            <td>{employee.salary}</td>
                        </tr>
                    )
                }
            </tbody>
        </table>
    </div>
  )
}

export default ListEmployee