import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { AuthNotice } from './auth-notice.interface';

@Injectable({
	providedIn: 'root'
})
export class AuthNoticeService {
	onNoticeChanged$: BehaviorSubject<AuthNotice>;

	constructor() {
		this.onNoticeChanged$ = new BehaviorSubject(null);
	}

	setNotice(message: string, type?: string) {
		const notice: AuthNotice = {
			message: message,
			type: type
		};
		this.onNoticeChanged$.next(notice);
	}

	setSuccessNotice(message: string){
		this.setNotice(message, 'success')
	}

	setErrorNotice(message: string){
		this.setNotice(message, 'error')
	}
}
