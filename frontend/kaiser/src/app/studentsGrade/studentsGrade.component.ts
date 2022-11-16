import { Component, OnDestroy, OnInit } from '@angular/core';
import { takeUntil } from 'rxjs';
import { StudentsGradeDto, StudentsGradeService } from '../service/studentsGrade.service';

@Component({
  selector: 'app-studentsGrade',
  templateUrl: './studentsGrade.component.html',
  styleUrls: ['./studentsGrade.component.css']
})
export class StudentsGradeComponent implements OnInit {
  
  // destroy$: Subject<boolean> = new Subject<boolean>(); 

  studentsGradeDto: StudentsGradeDto[];
  
  constructor(private studentsGradeService: StudentsGradeService) { }
  
  ngOnInit(): void {
    // this.studentsGradeDto = this.studentsGradeService.getStudentsDtoList();
      // then(studentsGradeServiceResult => this.studentsGradeDto = studentsGradeServiceResult);
      this.studentsGradeDto = [];
      this.getStudentsGradeDto();
  }

  getStudentsGradeDto() {
    this.studentsGradeService.getStudentsDtoList().subscribe((studentsGradeServiceResult: any) => {
		let stud = studentsGradeServiceResult;

    studentsGradeServiceResult.forEach((element: { email: string; name: string; gradeId: number; homeGradeTeacherId: number; }) => {
      let sgd = {
        email: "",
        name: '',
        gradeId: 0,
        homeGradeTeacherId: 0,
      };
      sgd.email = element.email;
      sgd.name = element.name;
      sgd.gradeId = element.gradeId;
      sgd.homeGradeTeacherId = element.homeGradeTeacherId;
      this.studentsGradeDto.push(sgd);
    });
    
    });
  }

}
